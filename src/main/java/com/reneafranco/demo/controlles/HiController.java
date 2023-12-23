package com.reneafranco.demo.controlles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {


    @GetMapping(path = "api/hello")
    public String HiThere(){
        return "Hello World";
    }
}
