package com.reneafranco.demo.controlles;

import com.reneafranco.demo.models.User;
import com.reneafranco.demo.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserControler {

    @Autowired
    private IUserService iUserService;


    @GetMapping(path = "/api/users")
    public List<User> getAll(){
       return iUserService.getAll();
    }
}
