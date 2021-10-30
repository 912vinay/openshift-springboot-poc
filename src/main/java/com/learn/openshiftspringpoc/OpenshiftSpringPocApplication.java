package com.learn.openshiftspringpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OpenshiftSpringPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftSpringPocApplication.class, args);
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello got";
    }

}
