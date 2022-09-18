package Challenges_Stacks_Queues_done;

import java.util.Scanner;
import java.util.Stack;

public class RedundantParentheses {
    /*You are given an balanced expression. You have to find if it contains duplicate parentheses or not. A set of parentheses are duplicate if same subexpression is surrounded by multiple parenthesis.

Input Format

First line contains integer t as number of test cases.
Next t lines contains one balanced expression each. */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i =0 ; i< n ; i++){
            String str = s.next();
            if (findDuplicateparenthesis(str)){
                System.out.println("Duplicate");
            }else {
                System.out.println("Not Duplicates");
            }
        }

        //2
        //(((a+(b))+(c+d)))
        //((a+(b))+(c+d))
    }
    static boolean findDuplicateparenthesis(String s) {
        // create a stack of characters
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
        char[] str = s.toCharArray();
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } // push open parenthesis '(', operators and
            // operands to stack
            else {
                Stack.push(ch);
            }
        }

        // No duplicates found
        return false;
    }
}
