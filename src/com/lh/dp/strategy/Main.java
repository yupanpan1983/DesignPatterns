package com.lh.dp.strategy;

import java.util.Arrays;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 9:12
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
//        int[] a = {2, 5, 4, 7, 1, 8, 3, 6, 9};
        Cat[] cats = {new Cat(200,200),new Cat(100,100),new Cat(600,600)};
//        Tiger[] tigers = {new Tiger(30),new Tiger(25),new Tiger(40)};
        Sorter<Cat> sorter = new Sorter<>();
//        sorter.sort(tigers,new TigerComparator());
//        sorter.sort(cats,new CatWeightComparator());
//        sorter.sort(cats,new CatHeightComparator());
        sorter.sort(cats,(o1,o2)->{
            if(o1.height < o2.height){
                return -1;
            }else if(o1.height > o2.height){
                return 1;
            }else{
                return 0;
            }
        });
        System.out.println(Arrays.toString(cats));
    }
}
