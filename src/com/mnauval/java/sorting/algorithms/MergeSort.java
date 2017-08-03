package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class MergeSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
        }
        mergeSort(list, 0, list.length - 1);
    }
    
    private static <T extends Comparable<? super T>> void mergeSort(T[] list, int low, int high) {
        if (low < high) {
            // find the middle point.
            int middle = (low + high) / 2;
            
            // sort the first and second halves
            mergeSort(list, low, middle);
            mergeSort(list, middle+1, high);
            
            // merge the sorted halves
            merge(list, low, middle, high);
        }
    }
    
    private static <T extends Comparable<? super T>> void merge(T[] list, int low, int middle, int high) {
        // create a helper array
        T[] helper = list.clone();
        
        // merging the data.
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
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
        while (j <= high) {
            list[k] = helper[j];
            j++;
            k++;
        }
    }
    
}
