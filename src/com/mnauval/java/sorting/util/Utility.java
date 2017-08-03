package com.mnauval.java.sorting.util;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Nauval
 */
public class Utility {
    public static <T extends Comparable<? super T>> boolean arrayIsSorted(T[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(list[i-1]) < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static <T extends Comparable<? super T>> boolean arrayIsSorted(ArrayList<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static <T extends Comparable<? super T>> T[] swap(T[] list, int source, int target) {
        T temp = list[source];
        list[source] = list[target];
        list[target] = temp;
        return list;
    }
    
    public static <T extends Comparable<? super T>> void print(T[] list) {
        for (Comparable value : list) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
    
    public static <T extends Comparable<? super T>> void print(ArrayList<T> list) {
        for (T value : list) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
