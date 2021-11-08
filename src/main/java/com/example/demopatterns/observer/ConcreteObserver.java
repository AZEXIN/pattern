package com.example.demopatterns.observer;

public class ConcreteObserver implements Observer {


    @Override
    public int update() {
        System.out.println("目标改变");
        return 0;
    }
}
