package com.example.hostel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boys {

    @GetMapping ("/boys")
    public String getData(){
        return " only boys allowed   ";
    }


}
