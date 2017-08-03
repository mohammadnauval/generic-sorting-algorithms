package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class InsertionSort {
    
    public static <T extends Comparable<? super T>> void sort(Comparable[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
        }
        
        for (int i = 0; i < list.length; i++) {
            int j = i;
            Comparable current = list[i];
            while (j > 0 && list[j-1].compareTo(current) > 0) {
                list[j] = list[j-1];
                j--;
            }
            list[j] = current;
        }
    }
    
}
