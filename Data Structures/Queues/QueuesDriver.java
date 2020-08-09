package Queues;

import Queues.Queue.ArrayQueue;
import Queues.Queue.QueueWithTwoStacks;

public class QueuesDriver {
    /**
     * Queues have two ends, we can add the element from one side, and can remove from other side
     * every operations for queue are with time complexity O(1)
     * Queue follows FIFO manner.
     */

    public static void main(String[] args) {
        // Implementation of java's util queue first.
        /*Queue<Integer> intqueue = new ArrayDeque<>();
        intqueue.add(10);
        intqueue.add(20);
        intqueue.add(30);
        intqueue.add(40);
        System.out.println(intqueue.remove());
        System.out.println(intqueue);
        Queueops operations = new Queueops();
        intqueue = operations.reverseQueue(intqueue);
        System.out.println(intqueue);*/

        // Implementation of ArrayQueue class we created to implement queue using array
        /*ArrayQueue queue = new ArrayQueue(5);
        queue.enQueue(12);
        queue.enQueue(23);
        queue.enQueue(78);
        queue.enQueue(32);
        queue.enQueue(63);
        queue.reverseQueue();
        System.out.println(queue);
        queue.deQueue();
        queue.enQueue(90);
        queue.deQueue();
        queue.enQueue(900);
        queue.deQueue();
        System.out.println(queue);
        queue.reverseQueue();
        System.out.println(queue);
        queue.enQueue(430);
        System.out.println(queue);*/

        // Implementation of QueueWithTwoStacks class to implement queue which is implemented using two stacks in the class
        QueueWithTwoStacks qwts = new QueueWithTwoStacks();
        qwts.enQueue(92);
        qwts.enQueue(90);
        qwts.enQueue(43);
        System.out.println(qwts.deQueue());
        System.out.println(qwts.peek());
        System.out.println(qwts.deQueue());
        System.out.println(qwts.peek());
    }
}
