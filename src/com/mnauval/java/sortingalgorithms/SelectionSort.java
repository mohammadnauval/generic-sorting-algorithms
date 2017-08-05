package com.mnauval.java.sortingalgorithms;

import com.mnauval.java.sortinglib.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class SelectionSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
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
    }
    
}
