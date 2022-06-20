package com.lh.dp.factorymethod;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 9:22
 * @Description: com.lh.dp.factorymethod
 * @version: 1.0
 */
public class PlaneFactory {

    public Moveable create(){
        //before processing
        return new Plane();
    }

}
