package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 10:23
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
@FunctionalInterface
public interface Comparator<T> {

   int compare(T o1,T o2);

   default String get(){
       return "abc";
   }
}
