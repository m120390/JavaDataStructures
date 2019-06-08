package Interfaces;

public interface Stack<T> {
    void push(T number);
    T pop();
    T peek();
    void printStack();
}