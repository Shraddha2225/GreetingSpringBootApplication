package com.bridgelab.demo.controller;

import com.bridgelab.demo.module.Greeting;
import com.bridgelab.demo.module.User;
import com.bridgelab.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private AtomicLong counter=new AtomicLong();
    private String template="Hello, %s!";

    @Autowired
    private IGreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "fName", defaultValue = "World") String firstName,
                             @RequestParam(value = "lName", defaultValue = "World") String lastName) {
        User user=new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @PutMapping("/put/greeting")
    public ResponseEntity<Greeting> putGreeting(@RequestBody Greeting greeting){
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
