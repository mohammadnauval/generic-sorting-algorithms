package com.mnauval.java.sortinglib;

/**
 *
 * @author Mohammad Nauval
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<? super E>> {
    private Node<E> root;
    
    public BinarySearchTree() {
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }
    
    public void inOrder() {
        inOrderRecursive(this.root);
    }
    
    public void inOrderToArray(E[] list) {
        inOrderToArrayRecursive(this.root, list, 0);
    }
    
    private void inOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        inOrderRecursive(root.getLeftNode());
        System.out.print(" " + root.getValue() + " ");
        inOrderRecursive(root.getRightNode());
    }
    
    private int inOrderToArrayRecursive(Node<E> root, E[] list, int index) {
        if (root == null) {
            return index;
        }
        index = inOrderToArrayRecursive(root.getLeftNode(), list, index);
        list[index++] = root.getValue();
        index = inOrderToArrayRecursive(root.getRightNode(), list, index);
        return index;
    }
    
    public void insert(E value) {
        this.root = insertRecursive(this.root, value); /* call a recursive function to insert the value */
    }
    
    // private recursive method for inserting a new value.
    private Node insertRecursive(Node<E> root, E value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            if (value.compareTo(root.getValue()) < 0) {
                root.setLeftNode(insertRecursive(root.getLeftNode(), value));
            } else {
                root.setRightNode(insertRecursive(root.getRightNode(), value));
            }
        }
        return root;
    }
    
    public void delete(E value) {
        this.root = deleteRecursive(this.root, value);
    }

    // private recursive method to delete a node.
    private Node<E> deleteRecursive(Node<E> root, E value) {
        if (root == null) {
            return root;
        }
        if (value.compareTo(root.getValue()) < 0) {
            root.setLeftNode(deleteRecursive(root.getLeftNode(), value));
            return root;
        } 
        if (value.compareTo(root.getValue()) > 0) {
            root.setRightNode(deleteRecursive(root.getRightNode(), value));
            return root;
        }
        
        // The value to be deleted is found.
        // Node to delete has only one child or no child.
        if (root.getLeftNode() == null) {
            return root.getRightNode();
        }
        if (root.getRightNode() == null) {
            return root.getLeftNode();
        }
        // Node to delete has two children.
        // Get the replacement by looking for the node with the smallest value in the right child.
        E minValue = minValue(root.getRightNode());
        root.setValue(minValue);
        root.setRightNode(deleteRecursive(root.getRightNode(), minValue));
        return root;
    }
    
    public E minValue(Node<E> root) {
        if (root == null) {
            throw new NullPointerException("Root is null");
        }
        E min = root.getValue();
        while (root.getLeftNode() != null) {
            min = root.getLeftNode().getValue();
            root = root.getLeftNode();
        }
        return min;
    }
}   
