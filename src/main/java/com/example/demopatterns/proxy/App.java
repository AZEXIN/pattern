package com.example.demopatterns.proxy;

/**
 * 客户端  由WizardTowerProxy 代理 IvoryTower 控制人数，避免了客户端直接访问IvoryTower
 */
public class App {

    public static void main(String[] args) {
        WizardTowerProxy wizardTowerProxy=new WizardTowerProxy(new IvoryTower());
        wizardTowerProxy.enter(new Wizard("RED"));
        wizardTowerProxy.enter(new Wizard("BLUE"));
        wizardTowerProxy.enter(new Wizard("YELLOW"));
        wizardTowerProxy.enter(new Wizard("RED2"));
    }
}
