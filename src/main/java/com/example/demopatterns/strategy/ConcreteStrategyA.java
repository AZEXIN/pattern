package com.example.demopatterns.strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("hello ConcreteStrategyA");
    }
}
