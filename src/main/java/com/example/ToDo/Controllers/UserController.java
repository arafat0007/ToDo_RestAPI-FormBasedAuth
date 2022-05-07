package com.example.ToDo.Controllers;

import com.example.ToDo.Domain.RegistrationRequest;
import com.example.ToDo.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(path = "/registration")
    public String UserRegister(@RequestBody RegistrationRequest request){
        return userService.userRegister(request);
    }

    @GetMapping(path = "/registration/confirm")
    public String confirm(@RequestParam("token") String token) {
        return userService.confirmToken(token);
    }
}
