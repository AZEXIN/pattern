package com.example.demopatterns.abstractfactory.keyboard;

import com.example.demopatterns.abstractfactory.dem.KeyBoard;

public class LuoJiKeyBoard implements KeyBoard {
    @Override
    public void produceKeyBoard(String name, String type) {
        System.out.println("罗技键盘"+name+"--"+type);
    }
}
