package com.dataStructures;

public interface stackInterface<T> {
    void push(T number);
    T pop();
    T peek();
    boolean isEmpty();
}