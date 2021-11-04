package com.example.demopatterns.proxy;

public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.getName()+"进入了IvoryTower");
    }
}
