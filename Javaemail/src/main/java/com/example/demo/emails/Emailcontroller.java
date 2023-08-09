package com.example.demo.emails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Emailcontroller {

    @Autowired
    private Emailservice emailService;

    @GetMapping("/sendemail")
    public String sendEmail() {
        emailService.sendSimpleEmail("sumiammu05@gmail.com", "Hello", "This is a test email.");
        return "Email sent!";
    }


}
