package com.example.demopatterns.strategy;

public class App {
    public static void main(String[] args) {
        // 环境类
        Context context=new Context();
        // 具体策略类A
        ConcreteStrategyA concreteStrategy =new ConcreteStrategyA();
        context.setStrategy(concreteStrategy);
        context.algorithm();
        // 具体策略类B
        ConcreteStrategyB concreteStrategyb =new ConcreteStrategyB();
        context.setStrategy(concreteStrategyb);
        context.algorithm();
    }
}
