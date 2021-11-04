package com.example.demopatterns.proxy;

/**
 * 代理主题角色
 */
public class WizardTowerProxy implements WizardTower {

    private IvoryTower ivoryTower;

    private Integer number = 0;

    public WizardTowerProxy(IvoryTower ivoryTower) {
        this.ivoryTower = ivoryTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (number < 3) {
            ivoryTower.enter(wizard);
        } else {
            System.out.println("人已满，不允许再进入");
        }
        number++;
    }
}
