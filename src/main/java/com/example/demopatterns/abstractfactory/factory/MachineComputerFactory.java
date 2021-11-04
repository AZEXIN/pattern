package com.example.demopatterns.abstractfactory.factory;

import com.example.demopatterns.abstractfactory.dem.ComputerFactory;
import com.example.demopatterns.abstractfactory.dem.KeyBoard;
import com.example.demopatterns.abstractfactory.dem.Mouse;
import com.example.demopatterns.abstractfactory.keyboard.LuoJiKeyBoard;
import com.example.demopatterns.abstractfactory.mouse.LuojiMouse;

public class MachineComputerFactory implements ComputerFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new LuoJiKeyBoard();
    }

    @Override
    public Mouse createMouse() {
        return new LuojiMouse();
    }
}
