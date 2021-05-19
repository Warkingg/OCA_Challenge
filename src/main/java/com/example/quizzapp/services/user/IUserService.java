package com.example.quizzapp.services.user;

import com.example.quizzapp.model.User;
import com.example.quizzapp.services.IGeneralService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
    Iterable<User> findAll();

    Optional<User> getCurrentUser();

    Optional<User> findById(Long id);

    UserDetails loadUserById(Long id);

    boolean isRegister(User user);

    User findByEmail(String email);

    boolean isCorrectConfirmPassword(User user);

    void delete(User user);
}
