package com.dataStructures;

import java.util.Arrays;

/**
 * This class implements the StackInterface using an array. Initial size is 3 if no initial size is passed in.
 * Stack is re-sized by 50% if additional space is needed. Does not re-size if the stack shrinks.
 * @author Matt Basso
 * @version 1.0
 */
public class StackArray<T> implements StackInterface<T> {
    private T[] array;
    private int stackPointer;
    private static final int INITIAL_STACK_SIZE = 3;

    public StackArray() {
        array = (T[]) new Object[INITIAL_STACK_SIZE];
        stackPointer = 0;
    }

    public StackArray(int initialArraySize) {
        array = (T[]) new Object[initialArraySize];
        stackPointer = 0;
    }
    /**
     * Pushes element on to the top of the stack.
     * @param element Whatever type of object that StackArray is initiated with.
     */
    @Override
    public void push(T element){

        if (stackPointer == array.length){
            arrayResize();
        }

        array[stackPointer++] = element;
    }

    /**
     * Pops the top element off the stack and returns the element. Also will set the array index that contained the
     * element to null.
     * @throws IllegalStateException if stack is empty any you try to pop an element off the stack
     */
    @Override
    public T pop(){

        if (isEmpty()){
            throw new IllegalStateException("Stack is empty. Can't pop any more items!");
        }

        T tempElement = array[stackPointer - 1];
        array[--stackPointer] = null;

        return tempElement;
    }

    /**
     * Returns the value of the element at the top of the stack. Does not remove (pop) the element.
     * @throws IllegalStateException if stack is empty and you try to peek at the value at the top of the stack
     */
    @Override
    public T peek(){

        if (stackPointer == 0){
            throw new IllegalStateException("Stack is empty. Nothing to peek at!");
        }

        return array[stackPointer - 1];
    }

    private boolean isEmpty(){
        return stackPointer == 0;
    }

    @Override
    public void printStack(){
        System.out.println("Stack: " + Arrays.toString(array));
    }

    /**
     * If the stack is full, this method will increase stack size by 50%
     */
    private void arrayResize() {
        array = Arrays.copyOf(array, array.length + (int)(array.length * .5));
    }

}
