package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 10:41
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height < o2.height){
            return -1;
        }else if(o1.height > o2.height){
            return 1;
        }else{
            return 0;
        }
    }
}
