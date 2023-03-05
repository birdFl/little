package com.example.little;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class LitlleTest {
    @GetMapping
    public String helloWorld(){
        System.out.println("Hello World");
        return "ok";
    }
}
