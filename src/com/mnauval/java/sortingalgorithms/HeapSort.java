package com.mnauval.java.sortingalgorithms;

import com.mnauval.java.sortinglib.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class HeapSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
        }
        int n = list.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        
        // extract elements from the heap.
        for (int i = n - 1; i >= 0; i--) {
            Utility.swap(list, i, 0);
            heapify(list, i, 0);
        }
        
    }
    
    private static <T extends Comparable<? super T>> void heapify(T[] list, int n, int i) {
        int largestValue = i;           // root
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        
        // if left child exists and is larger than root.
        if ((leftChild < n) && (list[largestValue].compareTo(list[leftChild]) < 0)) {
            largestValue = leftChild;
        }
        
        // if right child exists and is larger than root.
        if ((rightChild < n) && (list[largestValue].compareTo(list[rightChild]) < 0)) {
            largestValue = rightChild;
        }
        
        // if the largest value is not the root.
        if (largestValue != i) {
            Utility.swap(list, i, largestValue);
            
            // recursively heapify the affected child.
            heapify(list, n, largestValue);
        }
    }
    
}
