package dev_philipppetersohn.skilltest.user;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    List<User> findAll() {
        return users;
    }



    @PostConstruct
    private void init() {
        users.add(new User(1, "user1", "John", "Doe", "jahn.doe@gmail.com", 1234567890));
    }
}

