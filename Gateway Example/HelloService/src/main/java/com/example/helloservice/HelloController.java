package com.example.helloservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/sample")
public class HelloController {

    @Autowired
    private MyUserRepository myUserRepository;

    @RequestMapping("/hello")
    public String hello() {
        return "Guten Tag!";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Guten Tag, " + name;
    }

    // Zum Testen, dass Connection zur DB besteht
    @GetMapping("/users/{name}")
    public MyUser getUser(@PathVariable String name) {
        return myUserRepository.findByName(name);
    }
}
