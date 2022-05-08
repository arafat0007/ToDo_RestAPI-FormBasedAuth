package com.example.ToDo.Services;

import com.example.ToDo.Domain.RegistrationRequest;
import com.example.ToDo.Domain.User;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.ModelMap;

public interface UserService extends AuthenticationProvider{
    public String userRegister(RegistrationRequest request);
    public String confirmToken(String token);
    public String getLoggedInUserName();

    public User findUserByEmail(String loggedInUserEmail);

    public void saveUser(User user);
}
