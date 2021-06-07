package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CAFacade {
    private final CircularDependencyA circularDependencyA;
    private final CircularDependencyC circularDependencyC;

    @Autowired
    public CAFacade(CircularDependencyA circularDependencyA, CircularDependencyC circularDependencyC) {
        this.circularDependencyA = circularDependencyA;
        this.circularDependencyC = circularDependencyC;
    }


    public void aFromC() {
        System.out.printf("Class %s method from %s class\n", circularDependencyA.getName(), circularDependencyC.getName());
    }
}
