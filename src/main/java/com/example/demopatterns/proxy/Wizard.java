package com.example.demopatterns.proxy;

public class Wizard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wizard(String name) {
        this.name = name;
    }
}
