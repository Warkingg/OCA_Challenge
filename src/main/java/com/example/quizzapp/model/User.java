package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private String password;

    private String phoneNumber;

    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

}
