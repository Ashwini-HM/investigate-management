package com.cms.investigate_management.controller;

import com.cms.investigate_management.model.User;
import com.cms.investigate_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "UserController is working!";
    }

    @PostMapping("/login")
    public User login(@RequestBody User loginUser) {

        return userService.login(
                loginUser.getUsername(),
                loginUser.getPassword());
    }

    @GetMapping("/check")
    public String checkUser() {

        User user = userService.login("admin", "admin123");

        if (user != null) {
            return "Login Logic Working";
        }

        return "Login Logic Failed";
    }
}
