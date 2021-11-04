package com.example.demopatterns.build;

public class MakeBuilder implements CakeBuilder{

    private String name;

    public  MakeBuilder(String name){
        System.out.println(name+"开始制作蛋糕");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void knead() {
        System.out.println("揉面中-----");
    }

    @Override
    public void ferment() {
        System.out.println("发酵中----");
    }

    @Override
    public void bake(Integer minuter) {
        System.out.println("烘烤---"+minuter+"--分钟");
    }

    @Override
    public Cake getCake() {
        System.out.println("制作完成");
        return new Cake();
    }
}
