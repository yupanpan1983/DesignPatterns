package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 10:13
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class Tiger implements Comparable<Tiger> {

    int age;

    public Tiger(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Tiger t) {
        if(this.age < t.age){
            return -1;
        }else if(this.age > t.age){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                '}';
    }
}
