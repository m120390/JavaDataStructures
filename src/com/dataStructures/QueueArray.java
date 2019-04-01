package com.dataStructures;

/**
 * This class implements the QueueInterface using an array. Initial size is 3 if no initial size is passed in.
 * Queue is increased by 50% if additional space is needed. Does not re-size if the queue shrinks.
 * @author Matt Basso
 * @version 1.0
 */
public class QueueArray<T> implements QueueInterface<T>{

    private T[] queue;
    private int front;
    private int back;
    private int queueSize;
    private static final int INITIAL_QUEUE_SIZE = 3;

    public QueueArray() {
        this(INITIAL_QUEUE_SIZE);
    }

    public QueueArray(int initialQueueSize) {
        queue = (T[]) new Object[initialQueueSize];
        front = 0;
        back = 0;
        queueSize = 0;
    }

    /**
     * This method enqueues objects on to the queue. Will re-size queue if at max capacity.
     * @param element object to be added to the queue
     */
    @Override
    public void enQueue(T element){

        //Check if queue is at max capacity. If so, resize the queue by 50%

        if (queueSize == queue.length){
            reSizeQueue();
        }

        //enQueue the element
        queue[back++] = element;

        //Keeps the array circular by ensuring the back pointer remains within the boundaries of the array.
        back %= queue.length;

        //Increment the queue size counter
        queueSize++;

    }

    /**
     * This method returns the object that is in the front of the queue and marks the index in which it was stored
     * in as null.
     * @return returns the object that is in the front of the queue
     */
    @Override
    public T deQueue(){

        //Check if queue is empty
        if (queueSize == 0) { throw new IllegalStateException("deQueue operation failure: Queue is empty!");}

        //Get the element at the front of the queue and store in a temporary object
        T temp = queue[front];

        //Set the array index that the front element was in to null -- "remove it"
        queue[front++] = null;

        //Keeps the array circular by ensuring the front pointer remains within the boundaries of the array.
        front %=queue.length;

        queueSize--;

        return temp;
    }

    /**
     * This method returns the object that is in the front of the queue but does not remove the object from the queue
     * @return returns the object that is in the front of the queue but does not remove the object from the queue
     */
    @Override
    public T head(){

        //Check if queue is empty
        if (queueSize == 0) { throw new IllegalStateException("Head operation failure: Queue is empty!");}

        return queue[front];
    }

    /**
     * This method returns how many objects are in the queue
     * @return the size of the queue
     */
    @Override
    public int sizeOfQueue() {
        return queueSize;
    }

    /**
     * Prints the queue in FIFO order and not in the order in which the objects are stored in the underlying array
     */
    @Override
    public void printQueue() {

        //Prints out the queue in FIFO order
        StringBuilder sb = new StringBuilder("[");
        int tempFrontPointer = front;

        for(int i = 0; i < queue.length; i++){

            if (i == (queue.length - 1)){
                sb.append(queue[tempFrontPointer++]).append("]");
            }

            else {
                sb.append(queue[tempFrontPointer++]).append(", ");
                tempFrontPointer %= queue.length;
            }
        }

        System.out.println("Queue: " + sb.toString() + "\n");

        //This prints out the queue as the elements look stored in the array
        //System.out.println("Queue: " + Arrays.toString(queue) + "\n");
    }

    /**
     * If the queue reaches max capacity, this method re-sizes the queue by 50%
     */
    private void reSizeQueue(){

        //Create new array ("queue") where the size is 50% greater than the original size
        T[] tempArray = (T[]) new Object[queue.length + (int)(queue.length * .5)];

        //Copy the contents of the old queue into the new queue
        for(int i = 0; i < queue.length; i++){
           tempArray[i] = queue[front++];
           front %= queue.length;
        }

        front = 0;
        back = queue.length;
        queue = tempArray;
    }

}
