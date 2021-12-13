package allData.structure;

import org.w3c.dom.Node;

import java.util.Stack;

public class Implement {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char chr : input.toCharArray()) {
            stack.push(chr);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += (stack.pop());
        }
        return reversed;
    }

    public static String reverseStringLoop(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res = res + str.charAt(i);
        }
        return res;
    }

    public static String reverseRecur(String input) {
        if (input.isEmpty()) {
            System.out.println("String is empty.");
            return input;
        } else {
            return reverseRecur(input.substring(1)) + input.charAt(0);
        }
    }


    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (
                        (ch == ')' && top != '(') ||
                                (ch == '}' && top != '{') ||
                                (ch == '[' && top != ']')
                )
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
