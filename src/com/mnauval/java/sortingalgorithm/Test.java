package com.mnauval.java.sortingalgorithm;

import com.mnauval.java.sortingutil.Utility;
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
        Integer[] data6 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("------------------ Selection Sort ---------------------");
        Utility.print(SelectionSort.sort(data));
        Utility.print(SelectionSort.sort(data2));
        Utility.print(SelectionSort.sort(data3));
        Utility.print(SelectionSort.sort(data4));
        Utility.print(SelectionSort.sort(data5));
        Utility.print(SelectionSort.sort(data6));
        System.out.println("------------------ Bublle Sort ---------------------");
        Utility.print(BubbleSort.sort(data));
        Utility.print(BubbleSort.sort(data2));
        Utility.print(BubbleSort.sort(data3));
        Utility.print(BubbleSort.sort(data4));
        Utility.print(BubbleSort.sort(data5));
        Utility.print(BubbleSort.sort(data6));
        System.out.println("------------------ Insertion Sort ---------------------");
        Utility.print(InsertionSort.sort(data));
        Utility.print(InsertionSort.sort(data2));
        Utility.print(InsertionSort.sort(data3));
        Utility.print(InsertionSort.sort(data4));
        Utility.print(InsertionSort.sort(data5));
        Utility.print(InsertionSort.sort(data6));
        System.out.println("----------------- Merge Sort --------------------------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        Utility.print(MergeSort.sort(list));
    }
}
