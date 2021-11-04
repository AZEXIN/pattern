package com.example.demopatterns.adapter.handler;

public interface HandlerAdapter {

    boolean supports(Object handler);

    void  handler(Object handler);
}
