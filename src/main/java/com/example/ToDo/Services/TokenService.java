package com.example.ToDo.Services;

import com.example.ToDo.Domain.Token;
import com.example.ToDo.Repositories.TokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TokenService{
    private final TokenRepository tokenRepository;

    public Optional<Token> findByToken(String token) {
        return tokenRepository.findByToken(token);
    }

    public void save(Token token) {
        tokenRepository.save(token);
    }

    public void UpdateToken(Token confirmToken) {
        tokenRepository.save(confirmToken);
    }
}
