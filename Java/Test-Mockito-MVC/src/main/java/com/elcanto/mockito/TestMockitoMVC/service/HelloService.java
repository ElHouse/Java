package com.elcanto.mockito.TestMockitoMVC.service;


import org.springframework.stereotype.Component;

@Component
public class HelloService  {


    public String hello() {
        System.out.println("jjiiiiijiji");
        return "helloWorld";
    }
}
