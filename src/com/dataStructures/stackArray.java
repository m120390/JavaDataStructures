package com.dataStructures;

import java.util.Arrays;

/**
 * This generic class implements the stackInterface using the primitive array data structure. If no initial size is
 * passed in, the default array size is 3. If the stack reaches capacity, this implementation will double the size of
 * the stack. It does not reduce the size of the stack as elements are popped off/removed (possible future enhancement
 * to this class).
 * @author Matt Basso
 * @version 1.0
 */
public class stackArray<T> implements stackInterface<T> {
    private T[] array;
    private int stackPointer;

    public stackArray() {
        array = (T[]) new Object[3];
        stackPointer = 0;
    }

    public stackArray(int initialArraySize) {
        array = (T[]) new Object[initialArraySize];
        stackPointer = 0;
    }
    /**
     * Pushes element on to the top of the stack.
     * @param element Whatever type of object that stackArray is initiated with.
     */
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
    public T peek(){

        if (stackPointer == 0){
            throw new IllegalStateException("Stack is empty. Nothing to peek at!");
        }

        return array[stackPointer - 1];
    }

    private boolean isEmpty(){
        return stackPointer == 0;
    }

    public void printStack(){
        System.out.println("Stack: " + Arrays.toString(array));
    }

    /**
     * If the stack is full, this function when called will double the capacity of the stack.
     */
    private void arrayResize(){
        array = Arrays.copyOf(array, array.length * 2);
    }

}
