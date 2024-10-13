package dev_philipppetersohn.skilltest.user;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    List<User> findAll() {
        return users;
    }

    Optional<User> findById(Integer id) {
        return users.stream()
                .filter(user -> user.id().equals(id))
                .findFirst();
    }

    void create(User user) {
        users.add(user);
    }

    void update(User user, Integer id) {
        Optional<User> existingUser = findById(id);
        if(existingUser.isPresent()) {
            users.set(users.indexOf(existingUser.get()), user);
        }
    }

    void delete(Integer id) {
        Optional<User> existingUser = findById(id);
        existingUser.ifPresent(users::remove);
    }

    @PostConstruct
    private void init() {
        users.add(new User(1, "user1", "John", "Doe", "jahn.doe@gmail.com", 1234567890));
    }
}

