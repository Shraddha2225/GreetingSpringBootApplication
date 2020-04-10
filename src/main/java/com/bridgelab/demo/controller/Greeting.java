package com.bridgelab.demo.controller;

public class Greeting {
    long counter;
    String content;

    public Greeting(long counter, String content) {
        this.counter = counter;
        this.content = content;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
