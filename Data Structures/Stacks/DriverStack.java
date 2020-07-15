package Stacks;

import Stacks.examples.StackForConstantTimeComplexity;

public class DriverStack {
    /**
     * Stack follow the LIFO manner
     * Popular uses of stack is recent apps, Undo, Syntax checking for Compiler design, evaluating maths expressions etc.
     *
     * Operations and time complexities
     *
     * push(item) : O(1)
     * pop() : O(1)
     * peek() : O(1)
     * isEmpty() : O(1)
     */

    public static void main(String[] args) {
        /*// Reverse the string using stack
        String str = "letap knahsurv";
        StringReverser reverser = new StringReverser();
        System.out.println(reverser.reverseString(str));

        // check the expression balance of brackets using stack
        BalancedExpressionChecker expressionChecker = new BalancedExpressionChecker();
        boolean result = expressionChecker.checkExpression("<{}[]>");
        System.out.println(result);*/

        // let's use the Complex Stack class which we just created to get minimum in constant amount of time
        StackForConstantTimeComplexity stack = new StackForConstantTimeComplexity(5);
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(10);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //stack.push(1);
        System.out.println(stack.getMinimum());
        /*stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());*/

        /*// let's implement two stacks using one array in TwoStack Class.
        TwoStacks twoStacks = new TwoStacks(11);
        twoStacks.push1(12);
        twoStacks.push1(89);
        twoStacks.push2(90);
        twoStacks.push2(43);
        twoStacks.push2(90);

        System.out.println(twoStacks);*/
    }
}
