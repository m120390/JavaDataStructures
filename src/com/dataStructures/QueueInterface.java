package com.dataStructures;

public interface QueueInterface<T> {
    void enQueue(T number);
    T deQueue();
    T head();
    int sizeOfQueue();
    void printQueue();
}
