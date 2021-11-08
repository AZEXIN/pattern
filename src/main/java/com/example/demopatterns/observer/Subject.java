package com.example.demopatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标接口
 *
 * @author ChengZe
 */
public interface Subject {
    /**
     * 观察者
     */
    List<Observer> observers = new ArrayList<>();

    /**
     * 添加
     *
     * @param observer
     * @return
     */
    int attach(Observer observer);

    /**
     * 移除
     *
     * @param observer
     * @return
     */
    int detach(Observer observer);

    /**
     * 通知
     *
     * @return
     */
    int nottify();
}
