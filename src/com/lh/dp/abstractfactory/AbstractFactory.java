package com.lh.dp.abstractfactory;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 10:51
 * @Description: com.lh.dp.abstractfactory
 * @version: 1.0
 */
public abstract class AbstractFactory {

    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
    abstract Food createFood();


}
