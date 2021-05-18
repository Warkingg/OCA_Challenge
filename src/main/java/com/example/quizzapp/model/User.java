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

    @NotNull
    @Size(min = 6, max = 20, message = "Enter your password, 6 to 20 characters")
    private String password;

    @NotNull(message = "Confirm your password")
    @Size(min = 6, max = 20, message = "Enter 6 to 20 characters")
    private String rePassword;

    @NotNull(message = "Enter your phone number")
    @Pattern(regexp = "/^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$/", message = "Enter your phone number, max 20 characters")
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
