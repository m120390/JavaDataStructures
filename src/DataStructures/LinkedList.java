package DataStructures;

import Interfaces.List;

public class LinkedList<E> implements List<E> {
/*
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        size = 0;
    }

    @Override
    public void add(E element) {
        add(element, size);
    }

    @Override
    public void add(E element, int index) {

        //Check if index is less than zero or larger than the value of size
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index is out bounds");
        }

        //List is empty and the index is 0
        else if(isEmpty()){
            head = tail = new Node(element);
        }

        //List is not empty and the index is equal to the head node
        else if(index == 0){
            head.previous = new Node(element);
            head.previous.next = head;
            head = head.previous;
        }

        //List is not empty and the index is equal to the tail node
        else if(index == size - 1){
            tail.previous.next = new Node<>(element);
            tail.previous.next.next = tail;
            tail.previous.next.previous = tail.previous;
            tail.previous = tail.previous.next;
        }

        //List is not empty and the index is equal to the index after the tail node
        else if(index == size){
            tail.next = new Node(element);
            tail.next.previous = tail;
            tail = tail.next;
        }

        //List is not empty and the index is between the head node and tail node
        else{

            Node<E> temp = head;

            for(int i = 0; i < index; i++){
                temp = temp.next;
            }

            temp.previous.next = new Node(element);
            temp.previous.next.next = temp;
            temp.previous.next.previous = temp.previous;
            temp.previous = temp.previous.next;
        }

        size++;
    }

    @Override
    public boolean contains(Object o) {

        Node<E> temp = head;

        while(temp != null){
            if(temp.element.equals(o)){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    @Override
    public E get(int index) {

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index is out bounds");
        }

        Node<E> temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    E remove(int index){

        E temp;

        //Check if list is empty
        if(isEmpty()){
            throw new IndexOutOfBoundsException("List is empty");
        }

        //Check if index in range
        else if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index is out bounds");
        }

        //Check if list is only size of 1
        else if(size == 1){
            temp = (E)head.element;
            head = tail = null;
        }

        //Update head node
        else if(index == 0){
            temp = (E)head.element;
            head = head.next;
            head.previous.next = null;
            head.previous = null;
        }

        //List is not empty and the index is equal to the tail node
        else if(index == size - 1){
            temp = (E)tail.element;
            tail = tail.previous;
            tail.next.previous = null;
            tail.next = null;
        }

        //List is not empty and the index is between the head node and tail node
        else{

            Node<E> temp = head;

            for(int i = 0; i < index; i++){
                temp = temp.next;
            }

            temp.previous.next = new Node(element);
            temp.previous.next.next = temp;
            temp.previous.next.previous = temp.previous;
            temp.previous = temp.previous.next;
        }

        size++;


    }

    @Override
    public int size() { return size; }

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

    private class Node<E>{
        private E element;
        private Node next;
        private Node previous;

        Node(E element) {
            this.element = element;
        }
    }

    */
}
