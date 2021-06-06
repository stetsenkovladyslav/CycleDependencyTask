package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyA {
    private final String name;
    private CircularDependencyB circularDependencyB;

    @Autowired
    public CircularDependencyA(CircularDependencyB circularDependencyB) {
        this.circularDependencyB = circularDependencyB;
        this.name = "A";
    }

    public String getName() {
        return name;
    }

    public void bFromA() {
        System.out.printf("Class %s method from %s class\n", circularDependencyB.getName(), name);
    }
}