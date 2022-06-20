package com.lh.dp.abstractfactory;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 11:17
 * @Description: com.lh.dp.abstractfactory
 * @version: 1.0
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Food createFood() {
        return new Bread();
    }
}
