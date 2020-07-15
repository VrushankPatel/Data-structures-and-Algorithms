package Stacks.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpressionChecker {
    final List<Character> leftBrackets = Arrays.asList('(','[','{','<');
    final List<Character> rightBrackets = Arrays.asList(')','}',']','>');
    Stack<Character> characterStack = new Stack<>();

    public boolean checkExpression(String expression){
        for (char c : expression.toCharArray()) {
            if (isLeftBracket(c)){
                characterStack.push(c);
                continue;
            }else if (isRightBracket(c)){
                if (characterStack.empty()) return false;
                char top = characterStack.pop();
                if(!isBracketsMatch(top, c)) return false;
            }
        }
        return characterStack.isEmpty();
    }

    private boolean isLeftBracket(char c){
        return leftBrackets.contains(c);
    }

    private boolean isRightBracket(char c){
        return rightBrackets.contains(c);
    }

    private boolean isBracketsMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
