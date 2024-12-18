package com.in28minutes.springboot.jdbc.h2.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {



    @GetMapping("/test")
    public String test() {
        System.out.println("Api callled >>>>>>>>>>>>>");
     return "Rest API";
    }
}
