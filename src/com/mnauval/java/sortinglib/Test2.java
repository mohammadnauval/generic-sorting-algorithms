package com.mnauval.java.sortinglib;

import com.mnauval.java.sortinglib.BinarySearchTree;

/**
 *
 * @author Mohammad Nauval
 */
public class Test2 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(2);
        bst.inOrder();
        bst.delete(2);
        bst.delete(2);
        bst.delete(3);
        System.out.println("");
        bst.inOrder();
    }
}
