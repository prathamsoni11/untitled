package Challenges_Stacks_Queues_done;

import java.util.Scanner;
import java.util.Stack;

public class balanced_parenthesis {
    /*
    You are given a string of brackets i.e. '{', '}' , '(' , ')', '[' , ']' . You have to check whether the sequence of parenthesis is balanced or not.
For example, "(())", "(())()" are balanced and "())(", "(()))" are not.
*/
    static boolean balancedParenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')') {
                if (s.empty() || s.peek() != '(') {
                    return false;
                }
                s.pop();
            } else if (c == '}') {
                if (s.empty() || s.peek() != '{') {
                    return false;
                }
                s.pop();
            } else if (c == ']') {
                if (s.empty() || s.peek() != '[') {
                    return false;
                }
                s.pop();
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = balancedParenthesis(str);
        if (ans)
            System.out.println("Yes");
        else
            System.out.println("No");


        // (())
    }
}
