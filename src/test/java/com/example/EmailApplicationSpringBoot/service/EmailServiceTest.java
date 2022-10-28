package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.entity.Email;
import com.example.EmailApplicationSpringBoot.repository.EmailRepository;
import com.example.EmailApplicationSpringBoot.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailRepository emailRepository;

    @Test
    void sendEmail() {
        Email email = Email.builder()
                .fromEmailId("patra.anupal@outlook.com")
                .toEmailId("wrtwt@wer.com")
                .subject("Hello")
                .body("Hello world")
                .build();
        System.out.println(emailRepository.save(email));
    }

    @Test
    void countEmail() {
        System.out.println(emailRepository.countEmail("patra.anupal@outlook.com"));
    }
}