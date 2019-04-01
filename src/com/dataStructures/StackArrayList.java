package com.dataStructures;

import java.util.ArrayList;

/**
 * This class implements the StackInterface using an ArrayList. Any re-sizing needed is handled by the underlying
 * ArrayList.
 * @author Matt Basso
 * @version 1.0
 */
public class StackArrayList<T> implements StackInterface<T> {

    private ArrayList<T> arrayAsList;
    private int stackPointer;

    public StackArrayList() {
        arrayAsList = new ArrayList<>();
        stackPointer = 0;
    }

    /**
     * Pops the top element off the stack and returns the element. Will also remove the element from the stack.
     * @throws IllegalStateException if stack is empty any you try to pop an element off the stack
     */
    @Override
    public T pop(){

        if (arrayAsList.isEmpty()){
            throw new IllegalStateException("Stack is empty. Nothing to pop!");
        }

        T tempElement = arrayAsList.get(stackPointer - 1);
        arrayAsList.remove(--stackPointer);

        return tempElement;
    }

    /**
     * Pushes element on to the top of the stack.
     * @param element Whatever type of object that StackArray is initiated with.
     */
    @Override
    public void push(T element){
        arrayAsList.add(element);
        stackPointer++;
    }


    /**
     * Returns the value of the element at the top of the stack. Does not remove (pop) the element.
     * @throws IllegalStateException if stack is empty and you try to peek at the value at the top of the stack
     */
    @Override
    public T peek(){

        if (arrayAsList.isEmpty()){
            throw new IllegalStateException("Stack is empty. Nothing to pop!");
        }

        return arrayAsList.get(stackPointer - 1);
    }

    @Override
    public void printStack(){
        System.out.println(arrayAsList);
    }

}
