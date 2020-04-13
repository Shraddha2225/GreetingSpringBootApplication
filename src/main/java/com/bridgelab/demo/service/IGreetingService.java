package com.bridgelab.demo.service;

import com.bridgelab.demo.module.Greeting;
import com.bridgelab.demo.module.User;

import java.util.List;

public interface IGreetingService {

    Greeting addGreeting(User user);

    List<Greeting> getAllGreetings();

    Greeting getGreetingById(Long id);
}
