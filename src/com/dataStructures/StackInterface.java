package com.dataStructures;

public interface StackInterface<T> {
    void push(T number);
    T pop();
    T peek();
    void printStack();
}