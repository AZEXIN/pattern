package com.example.demopatterns.adapter.handler.impl;

import com.example.demopatterns.adapter.controller.impl.HttpController;
import com.example.demopatterns.adapter.handler.HandlerAdapter;

/**
 * 适配器
 */
public class HttpRequestHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {
        HttpController controller=(HttpController)handler;
        controller.handler();
    }
}
