package com.example.demo.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userRepo.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
     return ResponseEntity.created(null).build();
    }
}
