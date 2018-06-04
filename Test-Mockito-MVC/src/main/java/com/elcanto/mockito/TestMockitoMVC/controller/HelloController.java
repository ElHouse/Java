package com.elcanto.mockito.TestMockitoMVC.controller;


import com.elcanto.mockito.TestMockitoMVC.service.HelloService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public  String helloWoString(){

        return helloService.hello();
    }

    @GetMapping(value = "/json", produces = APPLICATION_JSON_VALUE)
    public Hello  helloJson(){
        return new Hello("adr","can");
    }

    @PostMapping(value = "/json", produces = APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Hello  helloJsonPost(@RequestBody Hello hello ){
        return hello;
    }


    public static class Hello {
        private String title;
        private String value;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        private Hello(){

        }

        private Hello(String title, String value) {
            this.title = title;
            this.value = value;
        }



    }
}
