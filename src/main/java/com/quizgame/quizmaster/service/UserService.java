package com.quizgame.quizmaster.service;

import com.quizgame.quizmaster.entity.User;
import com.quizgame.quizmaster.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
