package com.reneafranco.demo.services;

import com.reneafranco.demo.models.User;
import com.reneafranco.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }
}
