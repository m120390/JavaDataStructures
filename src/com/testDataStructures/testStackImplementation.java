package com.testDataStructures;

import com.dataStructures.*;

public class testStackImplementation {

    public static void main(String [] args){
        stackArray<String> callStack = new stackArray<>();

        //Test the following test cases when stackArray is initiated with an initial array size
        //stackArray<String> callStack = new stackArray<>(3);

        /*Test Case #1: Verify that default stack can be filled to max capacity */
        System.out.println("Test Case #1: Fill stack to max capacity");
        callStack.push("Method 1");
        callStack.push("Method 2");
        callStack.push("Method 3");
        callStack.printStack();
        System.out.println("Stack Pointer is pointing at " + callStack.peek());

        /*Test Case #2: Verify that the re-sizing of the stack works properly. Stack should double in size.*/
        System.out.println("\nTest Case #2: Verify stack re-sizing works");
        callStack.push("Method 4");
        callStack.printStack();
        System.out.println("Stack Pointer is pointing at " + callStack.peek());

        /*Test Case #3: Verify that all items from the stack can be popped*/
        System.out.println("\nTest Case #3: Remove all items from the stack.");
        callStack.pop();
        callStack.pop();
        callStack.pop();
        callStack.pop();
        callStack.printStack();

        /*
        //Test Case #4: Verify peek on empty stack returns an exception
        System.out.println("\nTest Case #4: Verify peek on empty stack returns an exception");
        callStack.peek();

        //Test Case #5: Verify pop on empty stack returns an exception
        System.out.println("\nTest Case #5: Verify pop on empty stack returns an exception");
        callStack.pop();
        */
    }

}
