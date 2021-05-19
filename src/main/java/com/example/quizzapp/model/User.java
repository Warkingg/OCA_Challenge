package com.example.quizzapp.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 20, message = "Enter up to 20 characters")
    private String username;

    @NotNull
    @Size(max = 30, message = "Enter your first name")
    private String firstName;

    @NotNull
    @Size(max = 30, message = "Enter your last name")
    private String lastName;

    private String password;

    private String rePassword;

    private String phoneNumber;

    @NotNull
    @Email(message = "Enter your email")
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

}
