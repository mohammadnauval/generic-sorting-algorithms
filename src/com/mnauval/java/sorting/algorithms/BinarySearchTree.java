package com.mnauval.java.sorting.algorithms;

/**
 *
 * @author Mohammad Nauval
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<? super E>> {
    private Node root;
    
    public BinarySearchTree() {
        
    }
    
    public BinarySearchTree(E element) {
        this.root = new Node<>(element);
    }
    
    public void insert(Node node) {
        if (root == null) {
            this.root = node;
        } else {
            if (node.getElement().compareTo(this.root.getElement()) < 0) {
                this.root.setLeftNode(node);
            } else {
                this.root.setRightNode(node);
            }
        }
    }
    
    public <T extends Comparable<? super T>> void traverse(Node node, T[] list, int i) {
        if (root != null) {
            traverse(root.getLeftNode(), list, i);
        }
    }
}   
