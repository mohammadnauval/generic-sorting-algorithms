package com.mnauval.java.sortingutil;

/**
 *
 * @author Mohammad Nauval
 */
public class Utility {
    public static boolean isSorted(Comparable[] list) {
        if (list.length == 0 || list.length == 1) {
            return true;
        }
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(list[i-1]) < 0) {
                return false;
            }
        }
        return true;
    }
    
    public static Comparable[] swap(Comparable[] list, int source, int target) {
        Comparable temp = list[source];
        list[source] = list[target];
        list[target] = temp;
        return list;
    }
    
    public static void print(Comparable[] list) {
        for (Comparable value : list) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
