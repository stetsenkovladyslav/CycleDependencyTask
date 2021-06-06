package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CircularDependencyC {
    private final String name;

    public CircularDependencyC() {
        this.name = "C";
    }

    public String getName() {
        return name;
    }

}
