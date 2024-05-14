package com.example.helloservice;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class StartupService {

    @Autowired
    private MyUserRepository myUserRepository;

    @PostConstruct
    public void init() {
        myUserRepository.save(new MyUser("Michi", "michi@example.com"));
        myUserRepository.save(new MyUser("Daniel", "daniel@example.com"));
        myUserRepository.save(new MyUser("Sandro", "sandro@example.com"));
        myUserRepository.save(new MyUser("Holger", "holger@example.com"));
        myUserRepository.save(new MyUser("Omar", "omar@example.com"));
        myUserRepository.save(new MyUser("Max", "max@example.com"));
    }
}
