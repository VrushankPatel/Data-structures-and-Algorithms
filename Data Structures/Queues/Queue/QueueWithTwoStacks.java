package Queues.Queue;

import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    // time complexity for enQueue operation in here is O(1)
    public void enQueue(int item){
        stack1.push(item);
    }

    // time complexity for deQueue operation in here is O(n)
    public int deQueue(){
        if (isEmpty()) throw new IllegalStateException(); // O(1)
        moveFromStack1ToStack2();  // O(n)
        return stack2.pop();
    }

    // time complexity for peek operation in here is O(n)
    public int peek(){
        if (isEmpty()) throw new IllegalStateException(); // O(1)
        moveFromStack1ToStack2();  // O(n)
        return stack2.peek();
    }

    // below method's time complexity is O(n)
    private void moveFromStack1ToStack2(){
        if (stack2.isEmpty())           // O(1 * n)
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
