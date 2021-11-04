package com.example.demopatterns.abstractfactory.keyboard;

import com.example.demopatterns.abstractfactory.dem.KeyBoard;

public class LeiBoKeyBoard implements KeyBoard {
    @Override
    public void produceKeyBoard(String name, String type) {
        System.out.println("雷柏键盘"+name+"--"+type);
    }
}
