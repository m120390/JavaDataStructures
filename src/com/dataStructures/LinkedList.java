package com.dataStructures;

public class LinkedList<T> {

    private Node head;
    private Node tail;
    private int nodeSize;

    LinkedList(){
        head = null;
        tail = null;
        nodeSize = 0;
    }

    public void add(T element){

        Node newNode = new Node(element);

        if (nodeSize == 0){
            head = newNode;
            tail = newNode;
        }

        tail = newNode;
    }

    public int getSize(){
        return nodeSize;
    }


    private class Node<T> {
        private T element;
        private Node next;

        Node(T element){
            this.element = element;
            this.next = null;
        }

        public T getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }
    }





}
