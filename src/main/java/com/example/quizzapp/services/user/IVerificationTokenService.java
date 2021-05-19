package com.example.quizzapp.services.user;

import com.example.quizzapp.model.VerificationToken;

public interface IVerificationTokenService {
    VerificationToken findByToken(String token);

    void save(VerificationToken token);
}
