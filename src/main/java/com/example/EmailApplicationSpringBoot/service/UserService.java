package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
