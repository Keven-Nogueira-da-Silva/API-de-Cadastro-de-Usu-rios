package com.register.users.register.users.model;


import com.register.users.register.users.Gender.UserGender;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Usuarios")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false)
    private int idade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private UserGender genero;

    User(){}

    User(String nome, String email, int idade, UserGender genero) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public UserGender getGenero() {
        return genero;
    }

    public void setGenero(UserGender genero) {
        this.genero = genero;
    }
}

