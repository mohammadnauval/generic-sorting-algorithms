package com.mnauval.java.sortinglib;

/**
 *
 * @author Mohammad Nauval
 * @param <E>
 */
public class BinarySearchTree2<E extends Comparable<? super E>> {
    public Node<E> root;
    
    public BinarySearchTree2() {
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }
    
    public void insert(E value) {
        insertRec(this.root, value); /* call a recursive function to insert the value */
    }
    
    // private recursive method for inserting a new value.
    private void insertRec(Node<E> root, E value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            if (value.compareTo(root.getValue()) < 0) {
                insertRec(root.getLeftNode(), value);
            } else {
                insertRec(root.getRightNode(), value);
            }
        }
    }

}   
