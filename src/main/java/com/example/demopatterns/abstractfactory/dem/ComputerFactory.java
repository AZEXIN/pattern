package com.example.demopatterns.abstractfactory.dem;

public interface ComputerFactory {

    /**
     * 键盘名称和类型

     * @return
     */
   KeyBoard createKeyBoard();


    /**
     * 鼠标
     * @return
     */
   Mouse createMouse();
}

