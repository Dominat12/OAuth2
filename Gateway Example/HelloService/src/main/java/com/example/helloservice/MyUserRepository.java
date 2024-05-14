package com.example.helloservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserRepository  extends JpaRepository<MyUser, Long> {

    MyUser findByName(String name);
}
