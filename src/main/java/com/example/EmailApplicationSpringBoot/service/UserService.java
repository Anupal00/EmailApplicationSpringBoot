package com.example.EmailApplicationSpringBoot.service;

import com.example.EmailApplicationSpringBoot.entity.User;
import com.example.EmailApplicationSpringBoot.exception.EmailException;
import com.example.EmailApplicationSpringBoot.exception.UserException;
import com.example.EmailApplicationSpringBoot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) throws EmailException {
        if(user.getEmail()!=null){
            return userRepository.save(user);
        }
        throw new EmailException("Email not Found");
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) throws UserException {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }
        throw new UserException("User not Found");
    }
}
