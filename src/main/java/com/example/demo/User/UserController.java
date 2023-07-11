package com.example.demo.User;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userRepo.findAll();
    }

    // GET /users
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return userRepo.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public String removeUser(@PathVariable int id) {
        return userRepo.deleteById(id);
    }

    //POST /users
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        userRepo.save(user);
    }
}
