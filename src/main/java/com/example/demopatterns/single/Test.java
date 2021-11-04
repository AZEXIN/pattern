package com.example.demopatterns.single;

public class Test {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        singleton.show();
    }
}
