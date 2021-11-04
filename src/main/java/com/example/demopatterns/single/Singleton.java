package com.example.demopatterns.single;

public class Singleton {
    private Singleton(){}

    private static Singleton singleton=null;

    public static synchronized Singleton getSingleton(){
        if(singleton==null){
            return new Singleton();
        }
        return singleton;
    }

    public void show(){
        System.out.println("线程安全的单例模式");
    }

}
