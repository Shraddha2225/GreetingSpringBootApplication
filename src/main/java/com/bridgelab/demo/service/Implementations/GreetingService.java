package com.bridgelab.demo.service.Implementations;

import com.bridgelab.demo.module.Greeting;
import com.bridgelab.demo.module.User;
import com.bridgelab.demo.repository.IGreetingRepository;
import com.bridgelab.demo.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message=user.toString().isEmpty()?"Hello World":
                "Hello "+user.getFirstName()+"  "+user.getLastName();
        Greeting greeting = new Greeting();
        greeting.setId(counter.incrementAndGet());
        greeting.setMessage(message);
        return greetingRepository.save(greeting);
    }

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
