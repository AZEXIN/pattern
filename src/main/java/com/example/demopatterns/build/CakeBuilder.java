package com.example.demopatterns.build;

public interface CakeBuilder {

    /**
     * 揉面
     */
    void knead();

    /**
     * 发酵
     */
    void ferment();

    /**
     * 烘烤
     * @param minuter
     */
    void bake(Integer minuter);

    /**
     * 获取蛋糕
     * @return
     */
    Cake getCake();
}
