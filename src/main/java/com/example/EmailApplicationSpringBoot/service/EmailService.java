package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.entity.Email;
import com.example.EmailApplicationSpringBoot.entity.User;
import com.example.EmailApplicationSpringBoot.repository.EmailRepository;
import com.example.EmailApplicationSpringBoot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailService {
    private final EmailRepository emailRepository;
    private final UserRepository userRepository;

    public EmailService(EmailRepository emailRepository, UserRepository userRepository) {
        this.emailRepository = emailRepository;
        this.userRepository = userRepository;
    }

    public String sendEmail(Email email) {
        Optional<User> userOptional = userRepository.findByEmail(email.getFromEmailId());
        if(userOptional.isPresent()){
            emailRepository.save(email);
            return "Successfully send";
        }
        else{
            return "User Email Not Found";
        }
    }

    public Long countEmail(String userId) {
        Optional<User> optionalUser = userRepository.findById(Long.parseLong(userId));
        if(optionalUser.isPresent()){
            String email = optionalUser.get().getEmail();
            return emailRepository.countEmail(email);
        }
        return 0L;
    }
}
