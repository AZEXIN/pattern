package com.example.demopatterns.adapter.controller.impl;

import com.example.demopatterns.adapter.controller.Controller;

public class HttpController implements Controller {
    @Override
    public void handler() {
        System.out.println("HttpController");
    }
}
