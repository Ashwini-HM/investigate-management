package com.cms.investigate_management.service;

import com.cms.investigate_management.model.User;
import com.cms.investigate_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user == null) {
            return null;
        }

        if (password.equals(user.getPassword())) {
            return user;
        }

        return null;
    }
}
