package com.example.demopatterns.observer;

/**
 * 具体目标
 * @author ChengZe
 */
public class ConcreteSubject implements Subject {


    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public int attach(Observer observer) {
        observers.add(observer);
        return 0;
    }

    @Override
    public int detach(Observer observer) {
        observers.remove(observer);
        return 0;
    }

    @Override
    public int nottify() {
        observers.forEach(Observer::update);
        return 0;
    }
}
