package com.register.users.register.users.controller;


import com.register.users.register.users.model.User;
import com.register.users.register.users.servicer.UserServicer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Registrar")

public class UserController {


    public final UserServicer userServicer;

    public UserController(UserServicer userServicer) {
        this.userServicer = userServicer;
    }

    @GetMapping
    public List<User> getAll() {
        return userServicer.listarUsuario();
    }

    @GetMapping("/{id}")
    public User buscarUsuarioPorId(@PathVariable Long id) {
        return userServicer.buscarUsuarioPorId(id);
    }

    @PostMapping
    public User criarUmNovoUsuario(@RequestBody User user) {
        return userServicer.criarUmNovoUsuario(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarUsuarioPeloId(@PathVariable Long id) {
        userServicer.deletarUsuarioPeloId(id);
        return ResponseEntity.noContent().build();
    }



}
