package com;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> next;
    private Node<T> prev;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev=null;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    public Node<T>getPrev(){
    	return prev;
    }
    
    public void setPrev(Node<T> prev){
    	this.prev = prev;
    }


    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
