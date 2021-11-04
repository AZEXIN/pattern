package com.example.demopatterns.build;

public class CakeSeller {

    public CakeSeller(){}


    public Cake sell(CakeBuilder cakeBuilder){
        cakeBuilder.knead();
        cakeBuilder.ferment();
        cakeBuilder.bake(30);
        return cakeBuilder.getCake();
    }
}
