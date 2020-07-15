package Stacks.examples;

// In this example of stack implementation, we implemented the getminimum method to get the minimum from stack
// in constant amount of time O(1).

public class StackForConstantTimeComplexity {
    int[] stack = null;
    int counter = 0;
    int minimum;
    public StackForConstantTimeComplexity(int length){
        stack = new int[length];
    }

    public void push(int item){
        if (counter == stack.length){ throw new StackOverflowError(); }

        if (isEmpty()) {
            minimum = item;
            stack[counter++] = item;
            return;
        }

        if (item <= minimum){
            stack[counter++] = 2*item - minimum;
            minimum = item;
            return;
        }

        stack[counter++] = item;
    }

    public int peek(){
        if (counter == 0){ throw new IllegalStateException(); }

        return stack[counter-1] > minimum ? stack[counter-1] : minimum;
    }

    public int pop(){
        if (isEmpty()){ throw new IllegalStateException(); }

        int top;

        if (stack[counter-1] < minimum){
            top = minimum;
            minimum = (2*minimum) - stack[counter-1];
            stack[--counter] = 0;
            return top;
        }

        top = stack[counter-1];
        stack[--counter] = 0;
        return top;
    }

    public int getMinimum(){
        return minimum;
    }
    public boolean isEmpty(){
        return counter == 0;
    }
}
