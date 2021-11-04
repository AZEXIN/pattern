package com.example.demopatterns.build;

public class Test {


    public static void main(String[] args) {
        CakeSeller cakeSeller=new CakeSeller();

        /**
         * 先指定一个蛋糕师傅  == 李师傅
         */
        MakeBuilder cakeMaker = new MakeBuilder("李师傅");
        Cake sell = cakeSeller.sell(cakeMaker);

    }
}
