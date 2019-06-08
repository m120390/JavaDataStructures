package Test;

import Interfaces.Queue;
import DataStructures.*;

public class TestQueueImplementation {

    public static void main(String [] args){
        Queue<String> messageQueue = new QueueArray<>();

        /*Test Case #1: Verify that Queue can be filled to max capacity. */
        System.out.println("Test Case #1: Fill Queue to max capacity.");
        messageQueue.enQueue("Message 1");
        messageQueue.enQueue("Message 2");
        messageQueue.enQueue("Message 3");
        messageQueue.printQueue();

        /*Test Case #2: Verify that the re-sizing of the Queue works properly. The Queue should re-size by 50%.
         * The following calls will re-size the Queue twice. The first re-size will re-size the Queue from a capacity
         * of 3 -> 4. The second re-size will re-size the Queue from a capacity of 4 -> 6. Then the following test case
         * will enqueue elements to fill the Queue size with six elements.*/
        System.out.println("Test Case #2: Re-size Queue twice and then fill Queue to max capacity.");
        messageQueue.enQueue("Message 4");
        messageQueue.enQueue("Message 5");
        messageQueue.enQueue("Message 6");
        messageQueue.printQueue();

        /*Test Case #3: Verify that all items from the Stack can be popped*/
        System.out.println("Test Case #3: Dequeue all the items from the Queue.");
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.printQueue();

        /* Test Case #4: Verify that circular array works */
        System.out.println("Test Case #4: Verify that underlying circular array actually loops Queue around");
        messageQueue.enQueue("Message 1");
        messageQueue.enQueue("Message 2");
        messageQueue.enQueue("Message 3");
        messageQueue.enQueue("Message 4");
        messageQueue.enQueue("Message 5");
        messageQueue.enQueue("Message 6");
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.deQueue();
        messageQueue.enQueue("Message 7");
        messageQueue.enQueue("Message 8");
        messageQueue.enQueue("Message 9");
        messageQueue.printQueue();

        /*
        //Test Case #4: Verify head on empty Queue returns an exception
        System.out.println("\nTest Case #4: Verify head on empty Queue returns an exception");
        messageQueue.head();

        //Test Case #5: Verify dequeue on empty Queue returns an exception
        System.out.println("\nTest Case #5: Verify dequeue on empty Queue returns an exception");
        messageQueue.deQueue();
        */
    }

}
