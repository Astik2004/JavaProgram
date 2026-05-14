package CoreDSA.Stack;

import java.util.Stack;

public class InFixToPrefix {

    public static void main(String[] args) {

        String s = "A-B-C-D";

        String res = infixToPrefix(s);

        System.out.println(res);
    }

    public static String infixToPrefix(String infix) {

        // Step 1: Reverse string
        String reversed = reverse(infix);

        // Step 2: Swap brackets
        String swapped = swapBrackets(reversed);

        // Step 3: Convert to postfix
        String postfix = infixToPostfix(swapped);

        // Step 4: Reverse postfix
        return reverse(postfix);
    }

    public static String infixToPostfix(String infix) {

        StringBuilder ans = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char c : infix.toCharArray()) {

            // Operand
            if((c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9')) {

                ans.append(c);
            }

            // Opening bracket
            else if(c == '(') {

                stack.push(c);
            }

            // Closing bracket
            else if(c == ')') {

                while(!stack.isEmpty() && stack.peek() != '(') {

                    ans.append(stack.pop());
                }

                stack.pop();
            }

            // Operator
            else {

                while(!stack.isEmpty() &&
                        priority(stack.peek()) >= priority(c)) {

                    ans.append(stack.pop());
                }

                stack.push(c);
            }
        }

        // Remaining operators
        while(!stack.isEmpty()) {

            ans.append(stack.pop());
        }

        return ans.toString();
    }

    public static int priority(char ch) {

        if(ch == '+' || ch == '-')
            return 1;

        if(ch == '*' || ch == '/')
            return 2;

        if(ch == '^')
            return 3;

        return -1;
    }

    public static String reverse(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    public static String swapBrackets(String s) {

        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()) {

            if(c == '(')
                ans.append(')');

            else if(c == ')')
                ans.append('(');

            else
                ans.append(c);
        }

        return ans.toString();
    }
}