package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 9:20
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class Cat implements Comparable<Cat> {

    int weight;
    int height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat cat){
        if(this.weight <  cat.weight){
            return -1;
        }else if(this.weight > cat.weight){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
