package DataStructures;

import Interfaces.Stack;

import java.util.Arrays;

/**
 * This class implements the Stack using an array. Initial size is 3 if no initial size is passed in.
 * Stack is re-sized by 50% if additional space is needed. Does not re-size if the Stack shrinks.
 * @author Matt Basso
 * @version 1.0
 */
public class StackArray<T> implements Stack<T> {
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
     * Pushes element on to the top of the Stack.
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
     * Pops the top element off the Stack and returns the element. Also will set the array index that contained the
     * element to null.
     * @throws IllegalStateException if Stack is empty any you try to pop an element off the Stack
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
     * Returns the value of the element at the top of the Stack. Does not remove (pop) the element.
     * @throws IllegalStateException if Stack is empty and you try to peek at the value at the top of the Stack
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
     * If the Stack is full, this method will increase Stack size by 50%
     */
    private void arrayResize() {
        array = Arrays.copyOf(array, array.length + (int)(array.length * .5));
    }

}
