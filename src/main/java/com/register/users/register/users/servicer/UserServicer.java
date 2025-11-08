package com.register.users.register.users.servicer;

import com.register.users.register.users.exception.DuplicateResourceException;
import com.register.users.register.users.exception.ResourceNotFoundException;
import com.register.users.register.users.model.User;
import com.register.users.register.users.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicer {

    private final UserRepository userRepository;

    public UserServicer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarUsuario() {
        return userRepository.findAll();
    }

    public User buscarUsuarioPorId(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado pelo ID informado."));
    }
    public User criarUmNovoUsuario(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new DuplicateResourceException("Já existe um usuário registrado com este e-mail: " + user.getEmail());
        }
        return userRepository.save(user);
    }

    public void deletarUsuarioPeloId(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("ID especificado não corresponde a nenhum registro: " + id);
        }
        userRepository.deleteById(id);
    }
}
