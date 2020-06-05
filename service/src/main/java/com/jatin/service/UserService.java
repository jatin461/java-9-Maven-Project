package com.jatin.service;

import com.jatin.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String getUser() {

        System.out.println("Inside getUser() method of UserService");
        System.out.println(userRepository);
        return "User Returned from service";
    }
}
