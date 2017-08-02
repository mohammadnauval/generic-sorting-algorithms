package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class InsertionSort {
    
    public static Comparable[] sort(Comparable[] list) {
        if (Utility.isSorted(list)) {
            return list;
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
        return list;
    }
    
}
