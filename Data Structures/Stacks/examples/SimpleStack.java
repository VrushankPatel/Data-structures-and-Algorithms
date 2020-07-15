package Stacks.examples;

import java.util.Arrays;


// This is the simple implementation of Stack using Arrays
public class SimpleStack {
    int[] stack = null;
    int counter = 0;

    public SimpleStack(int length){
        stack = new int[length];
    }

    public void push(int item){
        if (counter == stack.length){ throw new StackOverflowError(); }
        stack[counter++] = item;
    }

    public int peek(){
        if (counter == 0){ throw new IllegalStateException(); }
        return stack[counter-1];
    }

    public int pop(){
        if (counter == 0){ throw new IllegalStateException(); }
        int top = stack[counter-1];
        stack[--counter] = 0;
        return top;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    @Override
    public String toString() {
        int[] stackRemovedZeros = Arrays.copyOfRange(stack, 0, counter); // get zeros at the end removed
        return Arrays.toString(stackRemovedZeros);
    }
}
