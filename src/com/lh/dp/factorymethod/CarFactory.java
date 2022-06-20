package com.lh.dp.factorymethod;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 9:22
 * @Description: com.lh.dp.factorymethod
 * @version: 1.0
 */
/*
    简单工厂模式扩展代码不太方便
 */
public class CarFactory {

    public Moveable create(){
        //before processing
        return new Car();
    }

}
