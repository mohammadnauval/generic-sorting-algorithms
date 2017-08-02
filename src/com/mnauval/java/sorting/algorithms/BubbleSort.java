package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class BubbleSort {
    
    public static <T extends Comparable<? super T>> void sort(Comparable[] list) {
        if (Utility.isSorted(list)) {
            return;
        }
        
        int range = list.length;
        do {
            int newRange = 0;
            for (int i = 1; i < range; i++) {
                if (list[i].compareTo(list[i-1]) < 0) {
                    Utility.swap(list, i, i-1);
                    newRange = i;
                }
            }
            range = newRange;
        } while (range != 0);
    }
    
}
