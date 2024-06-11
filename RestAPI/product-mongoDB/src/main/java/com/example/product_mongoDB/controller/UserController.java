package com.example.product_mongoDB.controller;

import java.util.List;
import java.util.Optional;

import com.example.product_mongoDB.Repository.UserRepository;
import com.example.product_mongoDB.document.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    // Save method is predefine method in Mongo Repository
    // with this method we will save user in our database
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable String id) {
        Optional<User> user = userRepo.findById(id);

            return user.get();

    }

}

