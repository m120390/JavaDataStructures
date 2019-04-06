package com.testDataStructures;

import com.dataStructures.*;

public class TestLinkedListImplementation {

    public static void main(String [] arg){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList();

        //Test Case #1: Add two items to the linkedList (add method) and print out
        linkedList.add(1);
        linkedList.add(2);
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());

        //Test Case #2: Add element to the front of the linkedList (addFirst method) and print out
        linkedList.addFirst(3);
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());

        //Test Case #3: Remove all elements from the linkedList (remove) until empty;
        linkedList.remove();
        linkedList.remove();
        linkedList.remove();
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());

        //Test Case #4: Add three elements to the LinkedList. Remove all three elements (removeFirst method)
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());

        //Test Case #5: Test that getFirst and getLast on an empty list throws an exception. Then test that both return
        //the same value if there is one element in the list. Then test that getFirst and getLast return the
        //appropriate first and last elements if there is more than one item.
        //linkedList.getFirst();
        //linkedList.getLast();
        linkedList.add(1);
        System.out.println("First element is: " + linkedList.getFirst());
        System.out.println("Last element is: " + linkedList.getLast());
        linkedList.add(2);
        System.out.println("First element is: " + linkedList.getFirst());
        System.out.println("Last element is: " + linkedList.getLast());
        linkedList.remove();
        linkedList.remove();
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());

        //Test Case #6: Test the add(index, element). Run test case on empty list, on a list with one element, a list
        //with two elements, and a list with three elements.
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0, 3);
        linkedList.add(1, 4);
        linkedList.add(4, 5);
        linkedList.add(0, 6);
        linkedList.add(3, 7);
        System.out.println("LinkedList: " + linkedList + " Size: " + linkedList.getListSize());
    }
}
