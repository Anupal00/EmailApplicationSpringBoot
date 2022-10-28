package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.entity.User;
import com.example.EmailApplicationSpringBoot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void saveUser() {
        User user = User.builder()
                .firstName("Anupal")
                .lastName("Patra")
                .email("patra.anupal@outlook.com")
                .phoneNo("54569874556")
                .build();
        System.out.println(userRepository.save(user));
    }

    @Test
    void getAllUser() {
        System.out.println(userRepository.findAll());
    }

    @Test
    void getUserById() {
        System.out.println(userRepository.findById(1L).get());
    }
}