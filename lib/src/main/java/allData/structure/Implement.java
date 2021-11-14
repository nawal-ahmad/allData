package allData.structure;

import org.w3c.dom.Node;

import java.util.Stack;

public class Implement {
    public static String reverseString(String input){
        Stack<Character> stack = new Stack<>();

        for(char chr: input.toCharArray()){
            stack.push(chr);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += (stack.pop());
        }
        return reversed;
    }

    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch:input.toCharArray()) {
            if(ch == '(' || ch =='{' || ch =='['){
                stack.push(ch);
            }
            if (ch == ')' || ch==']' || ch=='}'){
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if(
                        (ch ==')' && top != '(')||
                        (ch =='}' && top != '{')||
                        (ch == '[' && top !=']')
                )
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
