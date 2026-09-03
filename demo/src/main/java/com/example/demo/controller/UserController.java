package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
    
    private final UserRepository userRepository;

    // Spring inatengeneza hii repository yenyewe (Dependency Injection)
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    // 1. Mbinu ya Kuhifadhi Mtumiaji (POST Request)
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user); // Inahifadhi kwenye database na kurudisha jibu
    }

    // 2. Mbinu ya Kusoma Watumiaji Wote (GET Request)
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll(); // Inaleta watumiaji Wote
    }
}
