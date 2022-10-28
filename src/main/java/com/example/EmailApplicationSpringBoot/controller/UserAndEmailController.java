package com.example.EmailApplicationSpringBoot.controller;

import com.example.EmailApplicationSpringBoot.entity.Email;
import com.example.EmailApplicationSpringBoot.entity.User;
import com.example.EmailApplicationSpringBoot.service.EmailService;
import com.example.EmailApplicationSpringBoot.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserAndEmailController {

    private final UserService userService;
    private final EmailService emailService;

    public UserAndEmailController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(name = "id") Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping("/email")
    public String sendEmail(@RequestBody Email email){
        return emailService.sendEmail(email);
    }

    @GetMapping("/emails/count")
    public Long countEmail(@RequestParam String user){
        return emailService.countEmail(user);
    }
}
