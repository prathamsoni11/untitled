package Challenges_Stacks_Queues_done;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_a_stack_using_recursion {
    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.empty()) {
            s.push(x);
            return;
        }

        int y = s.peek();
        s.pop();
        insertAtBottom(s, x);
        s.push(y);
    }

    static void reverseStack(Stack<Integer> s) {
        if (s.empty())
            return;

        int x = s.peek();
        s.pop();
        reverseStack(s);
        insertAtBottom(s, x);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.push(x);
        }

        reverseStack(s);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

        //3
        //3
        //2
        //1
    }
}
