package com.example.demopatterns.adapter.controller.impl;

import com.example.demopatterns.adapter.controller.Controller;

/**
 * 被适配器
 */
public class AnnotationController implements Controller {
    @Override
    public void handler() {
        System.out.println("AnnotationController");
    }
}
