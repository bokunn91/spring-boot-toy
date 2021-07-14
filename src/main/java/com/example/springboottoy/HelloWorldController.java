package com.example.springboottoy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String index() {
        return "Hello, Spring Boot!";
    }

}
