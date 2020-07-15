package Stacks.examples;

import java.util.Arrays;

public class TwoStacks {
    int[] stack = null;
    int counter1 = 0;
    int counter2 = 0;
    int stackSize;

    public TwoStacks(int size){
        stack = new int[size];
        stackSize = size;
        counter1 = -1;
        counter2 = size;
    }

    public void push1(int item){
        if (counter1 < counter2 - 1){
            stack[++counter1] = item;
        }else{
            throw new StackOverflowError();
        }
    }

    public void push2(int item){
        if (counter1 < counter2 - 1){
            stack[--counter2] = item;
        }else{
            throw new StackOverflowError();
        }
    }

    public void pop1(){
        if (counter1 >= 0){
            stack[counter1--] = 0;
        }else{
            throw new IllegalStateException();
        }
    }

    public void pop2(){
        if (counter2 < stackSize){
            stack[counter2++] = 0;
            return;
        }else{
            throw new IllegalStateException();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
