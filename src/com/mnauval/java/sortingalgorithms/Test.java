package com.mnauval.java.sortingalgorithms;

import com.mnauval.java.sortinglib.Utility;
import java.util.ArrayList;

/**
 *
 * @author Mohammad Nauval
 */
public class Test {
    public static void main(String[] args) {
        Integer[] data = {};
        Integer[] data2 = {1};
        Integer[] data3 = {3, 2};
        Integer[] data4 = {5, 2, 6, 1, 9};
        Integer[] data5 = {10, 11, 3, 6, 4, 2};
        Integer[] data6 = {10, 9, 8, 7, 4, 4, 6, 5, 4, 3, 1, 2, 1};
        System.out.println("------------------ Selection Sort ---------------------");
        System.out.println("------------------ Bublle Sort ---------------------");
        
        System.out.println("------------------ Insertion Sort ---------------------");
        
        System.out.println("----------------- Merge Sort --------------------------");
        /*MergeSort.sort(data5);
        MergeSort.sort(data6);
        Utility.print(data5);
        Utility.print(data6);*/
        System.out.println("------------------ Quick Sort -------------------------");
        /*QuickSort.sort(data5);
        Utility.print(data5);
        QuickSort.sort(data6);
        Utility.print(data6);*/
        System.out.println("------------------- Tree Sort ---------------------------");
        BinaryTreeSort.sort(data5);
        Utility.print(data5);
        BinaryTreeSort.sort(data6);
        Utility.print(data6);
    }
}
