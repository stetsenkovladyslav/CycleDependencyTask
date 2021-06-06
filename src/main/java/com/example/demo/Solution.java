package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Solution {

    @Autowired
    public void solution(CircularDependencyA circularDependencyA,
                         CircularDependencyB circularDependencyB,
                         CAFacade caFacade) {

        circularDependencyA.bFromA();
        circularDependencyB.cFromB();
        caFacade.aFromC();

    }
}