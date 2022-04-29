package com.example.ToDo.Controllers;

import com.example.ToDo.Domain.RegistrationRequest;
import com.example.ToDo.Repositories.UserRepository;
import com.example.ToDo.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    @RequestMapping(path = "/registration")
    public String UserRegister(@RequestBody RegistrationRequest request){
        return userService.userRegister(request);
    }
}
