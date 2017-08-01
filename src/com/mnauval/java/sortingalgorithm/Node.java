package com.mnauval.java.sortingalgorithm;

/**
 *
 * @author Mohammad Nauval
 * @param <E>
 */
public class Node<E extends Comparable<? super E>> {
    private final E element;
    private Node<E> leftNode;
    private Node<E> rightNode;
    
    public Node(E element) {
        this.element = element;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public Node(E element, Node leftNode, Node rightNode) {
        this.element = element;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    
    public E getElement() {
        return this.element;
    }
    
    public Node<E> getLeftNode() {
        return this.leftNode;
    }

    public Node<E> getRightNode() {
        return rightNode;
    }

    public void setLeftNode(Node<E> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node<E> rightNode) {
        this.rightNode = rightNode;
    }

}
