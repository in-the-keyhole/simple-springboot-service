package com.keyholesoftware.devops.simpleservice.api;

public class HelloResponse {

    public HelloResponse(String name) {
        this.greeting = "Hello " + name + " from Spring Boot";
    }

    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}