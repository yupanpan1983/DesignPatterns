package com.lh.dp.abstractfactory;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/17 - 06 - 17 - 10:30
 * @Description: com.lh.dp.abstractfactory
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        //现代人的产品一族
//        Car car = new Car();
//        car.go();
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//        Bread bread = new Bread();
//        bread.printName();

        //魔法世界中的人的产品一族
//        Broom broom = new Broom();
//        broom.go();
//        MagicStrick magicStrick = new MagicStrick();
//        magicStrick.shoot();
//        MushRoom mushRoom = new MushRoom();
//        mushRoom.printName();

        AbstractFactory factory = new MagicFactory();

        Vehicle vehicle = factory.createVehicle();
        vehicle.go();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();
        Food food = factory.createFood();
        food.printName();
    }
}
