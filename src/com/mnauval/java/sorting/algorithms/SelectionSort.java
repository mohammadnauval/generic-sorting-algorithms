package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class SelectionSort {
    
    public static <T extends Comparable<? super T>> T[] sort(T[] list) {
        if (Utility.isSorted(list)) {
            return list;
        }
        
        for (int i = 0; i < list.length - 1; i++) {
            int indexOfMinValue = i;
            for (int k = indexOfMinValue + 1; k < list.length; k++) {
                if (list[k].compareTo(list[indexOfMinValue]) < 0) {
                    indexOfMinValue = k;
                }
            }
            if (i != indexOfMinValue) {
                Utility.swap(list, i, indexOfMinValue);
            }
        }
        return list;
    }
    
}
