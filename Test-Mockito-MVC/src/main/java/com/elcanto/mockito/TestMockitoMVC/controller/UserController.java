package com.elcanto.mockito.TestMockitoMVC.controller;


import com.elcanto.mockito.TestMockitoMVC.dao.User;
import com.elcanto.mockito.TestMockitoMVC.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List <User> getUsers(){
        System.out.println("asdasdasd2");
        return  userRepository.findAll();
    }
}
