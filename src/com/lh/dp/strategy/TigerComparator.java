package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 10:24
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class TigerComparator implements Comparator<Tiger> {
    @Override
    public int compare(Tiger o1, Tiger o2) {
        if(o1.age > o2.age){
            return -1;
        }else if(o1.age < o2.age){
            return 1;
        }else{
            return 0;
        }
    }
}
