package com.lh.dp.strategy;

/**
 * @Auther: Yu Panpan
 * @Date: 2022/6/14 - 06 - 14 - 9:14
 * @Description: com.lh.dp.strategy
 * @version: 1.0
 */
public class Sorter<T> {

    public void sort(T[] array,Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (comparator.compare(array[j],array[index]) == -1)
                    index = j;
            }
            T temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
