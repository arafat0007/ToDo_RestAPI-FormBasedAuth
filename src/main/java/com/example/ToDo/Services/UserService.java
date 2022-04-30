package com.example.ToDo.Services;

import com.example.ToDo.Domain.RegistrationRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public String userRegister(RegistrationRequest request);
    public String confirmToken(String token);
}
