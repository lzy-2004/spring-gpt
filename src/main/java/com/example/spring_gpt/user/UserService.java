package com.example.spring_gpt.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findUserByUsername(String username)
    {
        return userRepository.findUserByUsername(username);
    }
}
