package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {
    private final String name;
    private final CircularDependencyC circularDependencyC;

    @Autowired
    public CircularDependencyB(CircularDependencyC circularDependencyC) {
        this.circularDependencyC = circularDependencyC;
        this.name = "B";
    }

    public String getName() {
        return name;
    }

    public void cFromB() {
        System.out.printf("Class %s method from %s class\n", circularDependencyC.getName(), name);
    }
}