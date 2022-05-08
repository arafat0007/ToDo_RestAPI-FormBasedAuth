package com.example.ToDo.Services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class TestService implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        System.out.println(authentication.getName());
        System.out.println(authentication.getCredentials().toString());
        return null;
    }

    @Override
    public boolean supports(Class<?> tokenType) {
        return tokenType.equals(UsernamePasswordAuthenticationToken.class);
    }
}
