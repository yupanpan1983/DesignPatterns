package com.lh.dp.factorymethod;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 9:17
 * @Description: com.lh.dp.factorymethod
 * @version: 1.0
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        //before processing前置操作：比如权限控制
        return new Car();
    }

    public Plane createPlane(){
        //before processing
        return new Plane();
    }

    public Broom createBroom(){
        //before processing
        return new Broom();
    }

}
