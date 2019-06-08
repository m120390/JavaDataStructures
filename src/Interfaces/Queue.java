package Interfaces;

public interface Queue<T> {
    void enQueue(T number);
    T deQueue();
    T head();
    int sizeOfQueue();
    void printQueue();
}
