package DataStructures;

import Interfaces.Queue;

/**
 * This class implements the Queue using an array. Initial size is 3 if no initial size is passed in.
 * Queue is increased by 50% if additional space is needed. Does not re-size if the Queue shrinks.
 * @author Matt Basso
 * @version 1.0
 */
public class QueueArray<T> implements Queue<T> {

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
     * This method enqueues objects on to the Queue. Will re-size Queue if at max capacity.
     * @param element object to be added to the Queue
     */
    @Override
    public void enQueue(T element){

        //Check if Queue is at max capacity. If so, resize the Queue by 50%

        if (queueSize == queue.length){
            reSizeQueue();
        }

        //enQueue the element
        queue[back++] = element;

        //Keeps the array circular by ensuring the back pointer remains within the boundaries of the array.
        back %= queue.length;

        //Increment the Queue size counter
        queueSize++;

    }

    /**
     * This method returns the object that is in the front of the Queue and marks the index in which it was stored
     * in as null.
     * @return returns the object that is in the front of the Queue
     */
    @Override
    public T deQueue(){

        //Check if Queue is empty
        if (queueSize == 0) { throw new IllegalStateException("deQueue operation failure: Queue is empty!");}

        //Get the element at the front of the Queue and store in a temporary object
        T temp = queue[front];

        //Set the array index that the front element was in to null -- "remove it"
        queue[front++] = null;

        //Keeps the array circular by ensuring the front pointer remains within the boundaries of the array.
        front %=queue.length;

        queueSize--;

        return temp;
    }

    /**
     * This method returns the object that is in the front of the Queue but does not remove the object from the Queue
     * @return returns the object that is in the front of the Queue but does not remove the object from the Queue
     */
    @Override
    public T head(){

        //Check if Queue is empty
        if (queueSize == 0) { throw new IllegalStateException("Head operation failure: Queue is empty!");}

        return queue[front];
    }

    /**
     * This method returns how many objects are in the Queue
     * @return the size of the Queue
     */
    @Override
    public int sizeOfQueue() {
        return queueSize;
    }

    /**
     * Prints the Queue in FIFO order and not in the order in which the objects are stored in the underlying array
     */
    @Override
    public void printQueue() {

        //Prints out the Queue in FIFO order
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

        //This prints out the Queue as the elements look stored in the array
        //System.out.println("Queue: " + Arrays.toString(Queue) + "\n");
    }

    /**
     * If the Queue reaches max capacity, this method re-sizes the Queue by 50%
     */
    private void reSizeQueue(){

        //Create new array ("Queue") where the size is 50% greater than the original size
        T[] tempArray = (T[]) new Object[queue.length + (int)(queue.length * .5)];

        //Copy the contents of the old Queue into the new Queue
        for(int i = 0; i < queue.length; i++){
           tempArray[i] = queue[front++];
           front %= queue.length;
        }

        front = 0;
        back = queue.length;
        queue = tempArray;
    }

}
