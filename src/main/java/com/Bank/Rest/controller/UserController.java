package com.Bank.Rest.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Bank.Rest.model.User;
import com.Bank.Rest.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController 
{
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }
    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestParam String accountNumber, @RequestParam String password) {
        User user = userService.login(accountNumber, password);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete/{accountNumber}")
    public ResponseEntity<String> deleteAccount(@PathVariable String accountNumber) {
        String message = userService.deleteAccount(accountNumber);
        return ResponseEntity.ok(message);
    }
    
    @GetMapping("/{accountNumber}")
    public User getUser(@PathVariable String accountNumber) {
        return userService.getUserByAccountNumber(accountNumber);
    }
    
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
  
}

