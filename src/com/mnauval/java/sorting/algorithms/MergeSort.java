package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class MergeSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.isSorted(list)) {
            return;
        }
        mergeSort(list, 0, list.length - 1);
    }
    
    private static <T extends Comparable<? super T>> void mergeSort(T[] list, int left, int right) {
        if (left < right) {
            // find the middle point.
            int middle = (left + right) / 2;
            
            // sort the first and second halves
            mergeSort(list, left, middle);
            mergeSort(list, middle+1, right);
            
            // merge the sorted halves
            merge(list, left, middle, right);
        }
    }
    
    private static <T extends Comparable<? super T>> void merge(T[] list, int left, int middle, int right) {
        // create a helper array.s
        T[] helper = list.clone();
        
        // merging the data.
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (helper[i].compareTo(helper[j]) <= 0) {
                list[k] = helper[i];
                i++;
            } else {
                list[k] = helper[j];
                j++;
            }
            k++;
        }
        
        // copy the rest of the left side.
        while (i <= middle) {
            list[k] = helper[i];
            i++;
            k++;
        }
        
        // copy the rest of the right side.
        while (j <= right) {
            list[k] = helper[j];
            j++;
            k++;
        }
    }
    
}
