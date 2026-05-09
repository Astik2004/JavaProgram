package CoreDSA.Stack;

import java.util.Stack;

public class InFixToPostFix {
    static void main(String[] args) {
        String s="A-B-C-D";
        String res=infixToPostFix(s);
        System.out.println(res);
    }
    public static String infixToPostFix(String infix) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char c:infix.toCharArray()){
            if((c>='A' && c<='Z')||(c>='a' && c<='z')||(c>='0'&&c<='9'))
            {
                ans.append(c);
            }
            else if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                while(!stack.isEmpty()&&(stack.peek()!='(')){
                    ans.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty()&& priorty(stack.peek()) >= priorty(c)){
                    ans.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
    public static int priorty(char ch) {
        if(ch == '+' || ch == '-')
            return 1;

        if(ch == '*' || ch == '/')
            return 2;

        if(ch == '^')
            return 3;

        return -1;
    }
}
