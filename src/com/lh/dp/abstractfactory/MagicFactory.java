package com.lh.dp.abstractfactory;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 11:18
 * @Description: com.lh.dp.abstractfactory
 * @version: 1.0
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStrick();
    }

    @Override
    Food createFood() {
        return new MushRoom();
    }
}
