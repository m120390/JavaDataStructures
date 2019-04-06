package com.dataStructures;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {

    private Node head;
    private Node tail;
    private int listSize;

    public SinglyLinkedList(){
        listSize = 0;
    }

    public void add(T element){

        Node newNode = new Node(element);

        if(listSize == 0){
            head = newNode;
            tail = newNode;
            listSize++;
        }

        else {
            tail.next = newNode;
            tail = newNode;
            listSize++;
        }
    }

    public void addFirst (T element){
        if(listSize == 0){
            add(element);
        }

        else{
            Node newNode = new Node(element);
            newNode.next = head;
            head = newNode;
            listSize++;
        }
    }

    public void add(int index, T element){
        
        if(index < 0 || index > listSize + 1){
            throw new IllegalStateException("Index out of bound");
        }
        
        else if(index == 0){
            addFirst(element);
        }

        else if(index == listSize){
            add(element);
        }


        else{
            Node newNode = new Node(element);
            Node currentNode = head;
            int i = 0;
            boolean atIndex = false;

            while (!atIndex){

                if (i == index - 1){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    listSize++;
                    atIndex = true;
                }
            }

        }
        
    }
    
    public T removeFirst(){

        T tempElement;

        if(listSize == 0){
            throw new NoSuchElementException("List is empty! Nothing to remove!");
        }

        else if(listSize == 1){
            tempElement = head.element;
            head = null;
            tail = null;
        }

        else {
            Node tempNode = head.next;
            tempElement = head.element;
            head.next = null;
            head = tempNode;
        }

        listSize--;
        return tempElement;
    }

    public T getFirst(){
        if(listSize == 0){
            throw new NoSuchElementException("List is empty! Nothing to remove!");
        }

        return head.element;
    }

    public T getLast(){
        if(listSize == 0){
            throw new NoSuchElementException("List is empty! Nothing to remove!");
        }

        return tail.element;
    }

    public T remove(){

        T tempElement;

        if(listSize == 0){
            throw new NoSuchElementException("List is empty! Nothing to remove!");
        }

        else if(listSize == 1){
            tempElement = head.element;
            head = null;
            tail = null;
        }

        else {
            Node tempNode = head;

            while (tempNode.next != tail) {
                tempNode = tempNode.next;
            }

            tempElement = tail.element;
            tail = tempNode;
            tail.next = null;
        }

        listSize--;
        return tempElement;
    }

    public int getListSize(){return listSize;}

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        Node tempNode = head;

        while(tempNode != null){
            str.append(tempNode.element).append(" ");
            tempNode = tempNode.next;
        }

        return str.toString();
    }

    private class Node{
        private T element;
        private Node next;

        Node(T element){
            this.element = element;
        }
    }
}
