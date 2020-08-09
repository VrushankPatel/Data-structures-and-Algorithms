package Queues.Queue;

import java.util.Arrays;
import java.util.Stack;

/**
 * Implementation of Queue using array.
 */
public class ArrayQueue {
    int[] queue = null;
    int rear;  //  one endpoint of queue where items will be stored
    int front; // another endpoint of the queue from where we'll remove items
    int count;  // track the number of elements in the queue.

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void enQueue(int element){
        if (count == queue.length) throw new StackOverflowError();  // if queue is full
        queue[rear] = element;  // added the item
        rear = (rear + 1) % queue.length; // we increment rear like this to reuse the front locations if any items are deleted.
        count++; // increment the number of items
    }

    // Dequeue will remove the item from the front.
    // below solution is the optimized solution for dequeue where we use circuler array.
    public int deQueue(){
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length; // we increment front like this to reuse the front locations if any items are deleted.
        count--; // because one item is deleted
        return item;
    }

    /**
     * this was my brute force solution, not so efficient.
    public int deQueue(){
        if (isEmpty()) throw new IllegalStateException();
        int temp = queue[0];
        for (int i = 0; i < queue.length; i++){
            if (i != queue.length - 1) queue[i] = queue[i+1];
            else queue[i] = 0;
        }
        rear--;
        return temp;
    }*/

    public boolean isEmpty(){
        return count == 0;
    }

    // let's reverse this queue using stack
    public void reverseQueue(){
        Stack<Integer> intstack = new Stack<Integer>();
        // first we'll push all the element from queue by remove operation and push them in to stack
        // this first while loop will run until queue is not empty
        while(!isEmpty()){
            intstack.push(deQueue());
        }
        // now, we'll pop the items from stack one by one and keep adding them into queue
        // this operation will run until stack is not empty.
        while (!intstack.isEmpty()){
            enQueue(intstack.pop());
        }
    }

    @Override
    public String toString() {
        return "queue = " + Arrays.toString(queue);
    }
}
