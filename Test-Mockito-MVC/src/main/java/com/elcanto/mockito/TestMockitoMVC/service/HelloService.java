package com.elcanto.mockito.TestMockitoMVC.service;


import org.springframework.stereotype.Component;

@Component
public class HelloService  {


    public String hello() {
        return "helloWorld";
    }
}
