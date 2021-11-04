package com.example.demopatterns.abstractfactory.mouse;

import com.example.demopatterns.abstractfactory.dem.Mouse;

public class LuojiMouse implements Mouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标"+name+"--"+type);
    }

    
}
