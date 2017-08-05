package com.mnauval.java.sortinglib;

/**
 *
 * @author Mohammad Nauval
 * @param <E>
 */
public class Node<E extends Comparable<? super E>> {
    private E value;
    private Node<E> leftNode;
    private Node<E> rightNode;
    
    public Node(E value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public E getValue() {
        return this.value;
    }
    
    public void setValue(E value) {
        this.value = value;
    }
    
    public Node<E> getLeftNode() {
        return this.leftNode;
    }

    public Node<E> getRightNode() {
        return this.rightNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
