package com.example.demopatterns.abstractfactory.mouse;

import com.example.demopatterns.abstractfactory.dem.Mouse;

public class LeiBoMouse implements Mouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标"+name+"--"+type);
    }


}
