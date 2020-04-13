package com.bridgelab.demo.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Greeting")
public class Greeting {
    @javax.persistence.Id
    private long Id;

    @Column(name = "message")
    private String message;

    public Greeting() {
    }

    public Greeting(long Id,String message) {
        this.Id=Id;
        this.message=message;
    }

    public long getId() {
        return Id;
    }

    public void setId(long incrementAndGet) {
        this.Id = incrementAndGet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String format) {
        this.message = format;
    }
}
