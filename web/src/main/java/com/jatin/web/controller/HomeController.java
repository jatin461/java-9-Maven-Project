package com.jatin.web.controller;

import com.jatin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getUser() {
        System.out.println("Hello World");
        System.out.println("Printing userService Object");
        System.out.println(userService);
//        User user = new User();
        return "Hello World";
    }
}
