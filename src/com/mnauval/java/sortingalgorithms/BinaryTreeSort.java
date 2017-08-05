package com.mnauval.java.sortingalgorithms;

import com.mnauval.java.sortinglib.BinarySearchTree;
import com.mnauval.java.sortinglib.Utility;

/**
 *
 * @author Mohammad Nauval
 */
public class BinaryTreeSort {
    
    public static <T extends Comparable<? super T>> void sort(T[] list) {
        if (Utility.arrayIsSorted(list)) {
            return;
        }
        
        // construct binary search tree from given array.
        BinarySearchTree<T> bst = new BinarySearchTree<>();
        for (int i = 0; i < list.length; i++) {
            bst.insert(list[i]);
        }
        
        // store inorder traversal of the BST in array.
        bst.inOrderToArray(list);
    }
    
}
