package com.example.hostel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class girls {

    @GetMapping("/girls")
    public String getData(){
        return " only boys allowed   ";
    }
}
