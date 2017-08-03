package com.mnauval.java.sorting.algorithms;

import com.mnauval.java.sorting.util.Utility;

/**
 * Quick sort algorithm using Hoare partition scheme.
 * @author Mohammad Nauval
 */
public class QuickSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
        }
        
        quickSort(list, 0, list.length - 1);
    }
    
    public static <T extends Comparable<? super T>> void quickSort(T[] list, int low, int high) {
        if (low < high) {
            int pivot = partition(list, low, high);
            quickSort(list, low, pivot - 1);
            quickSort(list, pivot + 1, high);
        }
    }
    
    public static <T extends Comparable<? super T>> int partition(T[] list, int low, int high) {
        T pivot = list[high];
        int i = low - 1;
        for (int j = low; j < high - 1; j++) {
            if (list[j].compareTo(pivot) < 0) {
                i = i + 1;
                Utility.swap(list, i, j);
            }
        }
        if (list[high].compareTo(list[i + 1]) < 0) {
            Utility.swap(list, high, i + 1);
        }
        return i + 1;
    }
    
}
