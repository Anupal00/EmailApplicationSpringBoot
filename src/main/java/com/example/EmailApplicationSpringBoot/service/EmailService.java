package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.repository.EmailRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }
}
