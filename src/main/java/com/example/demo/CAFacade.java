package com.example.demo;
/*
        C -> A
        A -> B
        B -> C*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CAFacade {
    private CircularDependencyA circularDependencyA;
    private CircularDependencyC circularDependencyC;

    @Autowired
    public CAFacade(CircularDependencyA circularDependencyA, CircularDependencyC circularDependencyC) {
        this.circularDependencyA = circularDependencyA;
        this.circularDependencyC = circularDependencyC;
    }


    public void aFromC() {
        System.out.printf("Class %s method from %s class\n", circularDependencyA.getName(), circularDependencyC.getName());
    }
}
