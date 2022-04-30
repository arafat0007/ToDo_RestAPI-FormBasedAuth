package com.example.ToDo.Controllers;

import com.example.ToDo.Domain.RegistrationRequest;
import com.example.ToDo.Repositories.UserRepository;
import com.example.ToDo.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/registration")
public class UserController {
    private final UserService userService;

    @PostMapping
    public String UserRegister(@RequestBody RegistrationRequest request){
        return userService.userRegister(request);
    }

    @GetMapping(path = "/confirm")
    public String confirm(@RequestParam("token") String token) {
        return userService.confirmToken(token);
    }
}
