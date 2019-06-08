package Test;

import DataStructures.LinkedList;
import Interfaces.List;
import DataStructures.ArrayList;

public class TestListImplementation {

    public static void main(String [] arg){
        List<Integer> list = new LinkedList<>();

        /*
        //Test Case #1: Add two elements using the add() method and verify size
        list.add(1);
        list.add(2);
        System.out.println("list: " + list + " Size: " + list.size());
        */

        /*
        //Test Case #2: Add two elements using the add() method, two elements using add(E element, int index method, test
        //adding an index outside the range (index < 0) and (index > listSize);
        list.add(1);
        list.add(2);
        list.add(3,0);
        list.add(4,3);
        //list.add(1, -1); //This one tests out of range
        //list.add(5, 5); //This one tests out of range
        System.out.println("list: " + list + " Size: " + list.size());
        */

        /*
        //Test Case #3: Check the contains method where the element exists and the element doesn't exist
        System.out.println("Does an empty list contain 1? " + list.contains(1));
        list.add(1);
        list.add(2);
        System.out.println("list: " + list + " Size: " + list.size());
        System.out.println("After adding 1 & 2 to the list, does list contain 1? " + list.contains(1));
        System.out.println("After adding 1 & 2 to the list, does list contain 2? " + list.contains(2));
        System.out.println("After adding 1 & 2 to the list, does list contain 3? " + list.contains(3));
        */

        /*
        //Test Case #4: Test the get method on a empty list, on a list where the index is within boundaries, and where the
        //index is out of bounds (index < 0) and (index >= listSize);
        //list.get(0); //Running get on an empty list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list: " + list + " Size: " + list.size());
        System.out.println("Element in 2nd index: " + list.get(2));
        //list.get(3); // Calling get with an index >= listSize
        //list.get(-1); // Calling get with an index < 0
        */

        /*
        //Test Case #5: Test isEmpty method on an empty list and a list with elements
        System.out.println("Empty list is empty? " + list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list: " + list + " Size: " + list.size());
        System.out.println("Is list with elements 1, 2, 3 empty? " + list.isEmpty());
        */

        /*
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println("list: " + list + " Size: " + list.size());
        System.out.println("Is list where we removed all the elements we added empty? " + list.isEmpty());
        */

        /*
        //Test Case #6: Test the remove method, by trying to remove an index from an empty list, from a list with elements
        //and try to remove an index is that is out of bounds (index < 0) and (index >= listSize);
        //list.remove(0); Try removing an element from an empty list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list: " + list + " Size: " + list.size());
        //list.remove(0); //Remove first element
        list.remove(2); //Remove last element
        System.out.println("list: " + list + " Size: " + list.size());
        //list.remove(-1); // Try removing negative index
        list.remove(2); // Try removing index >= listSize
        */

        /*
        //Test Case #7: Try set method on an empty list. Use set on a list with elements. Try to set an index that is
        //out of bounds (index < 0) and (index > listSize);
        //list.set(1,1); //Try to set index 1 to 1 on an empty list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list: " + list + " Size: " + list.size());
        list.set(3,0);
        list.set(2,1);
        list.set(1,2);
        System.out.println("list: " + list + " Size: " + list.size());
        //list.set(4,4); //Try setting an index where index > listSize
        */

    }
}
