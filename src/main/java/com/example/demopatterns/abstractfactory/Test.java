package com.example.demopatterns.abstractfactory;

import com.example.demopatterns.abstractfactory.dem.KeyBoard;
import com.example.demopatterns.abstractfactory.dem.Mouse;
import com.example.demopatterns.abstractfactory.factory.LenovoComputerFactory;
import com.example.demopatterns.abstractfactory.factory.MachineComputerFactory;

public class Test {

    public static void main(String[] args) {
        LenovoComputerFactory lenovoComputerFactory=new LenovoComputerFactory();
        KeyBoard keyBoard = lenovoComputerFactory.createKeyBoard();
        keyBoard.produceKeyBoard("X","无线");
        Mouse mouse = lenovoComputerFactory.createMouse();
        mouse.produceMouse("X","无线");

        System.out.println("--------------------------------");

        MachineComputerFactory machineComputerFactory=new MachineComputerFactory();
        KeyBoard keyBoard1 = machineComputerFactory.createKeyBoard();
        Mouse mouse1 = machineComputerFactory.createMouse();
        keyBoard1.produceKeyBoard("Y","有线");
        mouse1.produceMouse("Y","有线");
    }


}
