package DataStructures;

import Interfaces.List;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private E[] array;
    private static final int INITIAL_CAPACITY = 10;
    private int listSize;

    public ArrayList() {
        this(INITIAL_CAPACITY);
    }

    public ArrayList(int capacity) {
        array = (E[]) new Object[capacity];
        listSize = 0;
    }

    public void add(E element) {
        sufficientCapacity(); //checks if enough capacity to add another element
        array[listSize++] = element;
    }

    public void add(E element, int index) {
        if(index < 0 || index > listSize){
            throw new IndexOutOfBoundsException("Index you want to retrieve is out of bounds");
        }
        sufficientCapacity();
        shiftArrayUp(index);
        array[index] = element;
        listSize++;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < listSize; i++) {
            if (array[i].equals(o))
                return true;
        }

        return false;
    }

    public E get(int index) {
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index you want to retrieve is out of bounds");
        }

        return array[index];
    }

    public boolean isEmpty(){
        return listSize == 0;
    }

    public E remove(int index) {
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index you want to retrieve is out of bounds");
        }

        E temp = array[index];
        shiftArrayDown(index);
        listSize--;
        return temp;
    }

    public E set(E element, int index) {
        if(index < 0 || index > listSize){
            throw new IndexOutOfBoundsException("Index you want to retrieve is out of bounds");
        }

        E temp = array[index];
        array[index] = element;
        return temp;
    }

    public int size() {return listSize;}

    public String toString() {
        StringBuilder sbr = new StringBuilder();

        for (E element : array) {
            sbr.append(element).append(" ");
        }

        return sbr.toString();
    }

    //Internal Helper Methods
    private void sufficientCapacity() {
        if (array.length == listSize)
            array = Arrays.copyOf(array, array.length + (int) (array.length * .5));
    }

    private void shiftArrayUp(int index) {

        for (int i = listSize; i > index; i--) {
            array[i] = array[i - 1];
        }
    }

    private void shiftArrayDown(int index) {
        for (int i = index; i < listSize; i++) {
            array[i] = array[i + 1];
        }
    }

}