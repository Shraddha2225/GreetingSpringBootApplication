package com.bridgelab.demo.repository;

import com.bridgelab.demo.module.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting, Long> {
}
