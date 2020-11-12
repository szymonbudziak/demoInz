package com.example.demo.controllers;

import com.example.demo.databaseUtils.entity.User;
import com.example.demo.databaseUtils.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;


    @GetMapping("/regiter")
    public void regster(){
    }

    @PostMapping("/register")
    public void register(@RequestBody User user){
        userRepository.save(user);
    }
}
