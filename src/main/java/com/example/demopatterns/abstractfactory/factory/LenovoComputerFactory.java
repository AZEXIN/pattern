package com.example.demopatterns.abstractfactory.factory;

import com.example.demopatterns.abstractfactory.dem.ComputerFactory;
import com.example.demopatterns.abstractfactory.dem.KeyBoard;
import com.example.demopatterns.abstractfactory.dem.Mouse;
import com.example.demopatterns.abstractfactory.keyboard.LeiBoKeyBoard;
import com.example.demopatterns.abstractfactory.mouse.LeiBoMouse;

public class LenovoComputerFactory implements ComputerFactory {

    // 雷柏的键盘和鼠标

    @Override
    public KeyBoard createKeyBoard() {
        return new LeiBoKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new LeiBoMouse();
    }
}
