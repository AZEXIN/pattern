package com.example.demopatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标接口
 * @author ChengZe
 */
public interface Subject {

    List<Observer> observers=new ArrayList<>();

    int attach(Observer observer);

    int detach(Observer observer);

    int nottify();
}
