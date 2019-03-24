package com.dataStructures;

import java.util.Arrays;

public class stackArray<T> implements stackInterface<T> {

    private int maxSize;
    private T[] array;
    private int top;

    public stackArray(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        top = 0;
    }

    //test comment

    public void push(T element){

        if (top == maxSize){
            arrayResize();
        }

        array[top++] = element;
    }

    public T pop(){
        return array[top--];
    }

    public T peek(){
        return array[top];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    private void arrayResize(){

        array = Arrays.copyOf(array, maxSize * 2);
        maxSize *= 2;
    }

}
