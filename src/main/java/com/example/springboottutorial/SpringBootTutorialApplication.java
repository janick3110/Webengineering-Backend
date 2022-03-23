package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/foo")
    public String sayGoodbye(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Goodbye %s!", name);
    }

    @GetMapping("/error")
    public String sayError(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("You did something wrong %s!",name);
    }
}
