package Stacks.examples;

import java.util.Stack;

public class StringReverser {
    public String reverseString(String input){
        if (input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> inputStack = new Stack<Character>();
        for (char c : input.toCharArray()) {
            inputStack.push(c);
        }
        StringBuilder reversedString = new StringBuilder();
        while(!inputStack.isEmpty()){
            reversedString.append(inputStack.pop());
        }
        return reversedString.toString();
    }
}
