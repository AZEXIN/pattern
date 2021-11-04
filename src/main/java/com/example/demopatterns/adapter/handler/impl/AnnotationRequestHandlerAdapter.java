package com.example.demopatterns.adapter.handler.impl;

import com.example.demopatterns.adapter.controller.impl.AnnotationController;
import com.example.demopatterns.adapter.controller.impl.HttpController;
import com.example.demopatterns.adapter.handler.HandlerAdapter;

public class AnnotationRequestHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        AnnotationController controller=(AnnotationController)handler;
        controller.handler();
    }
}
