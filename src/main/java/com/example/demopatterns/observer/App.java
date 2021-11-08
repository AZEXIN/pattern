package com.example.demopatterns.observer;

public class App {

    public static void main(String[] args) {
        // 创建观察者
        ConcreteObserver concreteObserver=new ConcreteObserver();

        // 创建具体目标
        ConcreteSubject subject=new ConcreteSubject();
        // 为目标添加观察者
        subject.attach(concreteObserver);
        // 修改目标
        subject.setState(1);
        // 通知观察者
        subject.nottify();

    }
}
