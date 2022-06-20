package com.lh.dp.factorymethod;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 9:06
 * @Description: com.lh.dp.factorymethod
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//        Plane plane = new Plane();
//        plane.go();
//        Moveable m = new Plane();
//        m.go();
          Moveable m = new CarFactory().create();
          m.go();
    }

}
