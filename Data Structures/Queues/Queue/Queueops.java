package Queues.Queue;

import java.util.Queue;
import java.util.Stack;

// reverse the java util queue.
public class Queueops {

    // let's reverse this queue using stack
    public Queue<Integer> reverseQueue(Queue<Integer> intqueue){
        Stack<Integer> intstack = new Stack<Integer>();
        while(!intqueue.isEmpty()){
            intstack.push(intqueue.remove());
        }
        while (!intstack.isEmpty()){
            intqueue.add(intstack.pop());
        }
        return intqueue;
    }
}
