package com.mnauval.java.sortingalgorithm;

import com.mnauval.java.sortingutil.Utility;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Nauval
 */
public class MergeSort {
    
    public static <T extends Comparable<? super T>> ArrayList<T> sort(ArrayList<T> list) {
        if (Utility.isSorted(list)) {
            return list;
        }
        mergeSort(list, 0, list.size() - 1);
        
        return list;
    }
    
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> list, int left, int right) {
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
    
    public static <T extends Comparable<? super T>> void merge(ArrayList<T> list, int left, int middle, int right) {
        // size of two temp. lists.
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // initialize two temp. lists.
        ArrayList<T> temp1 = new ArrayList<>();
        ArrayList<T> temp2 = new ArrayList<>();
        
        // insert values into two temp. list
        for (int i = 0; i < n1; i++) {
            temp1.add(list.get(left + i));
        }
        for (int i = 0; i < n2; i++) {
            temp2.add(list.get(middle + 1 + i));
        }
        
        // merge two lists.
        int i = 0; 
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (temp1.get(i).compareTo(temp2.get(j)) <= 0) {
                list.set(k, temp1.get(i));
                i++;
            } else {
                list.set(k, temp2.get(j));
                j++;
            }
            k++;
        }
        
        // copy the remaining values from the first temp. array.
        while (i < n1) {
            list.set(k, temp1.get(i));
            i++;
            k++;
        }
        
        // copy the remaining values from the second temp. array.
        while (j < n2) {
            list.set(k, temp2.get(j));
            j++;
            k++;
        }
    }
    
}
