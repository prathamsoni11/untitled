package Challenges_Stacks_Queues_done;

import java.util.Scanner;
import java.util.Stack;

public class histogram {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        long[] arr = new long[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextLong();
        }

        long maxArea = 0;
        long pArea = 0;

        Stack stack = new Stack();

        int i = 0;
        while (i < arr.length) {

            if (stack.isEmpty() || arr[i] > arr[(int) stack.peek()]) {
                stack.push(i);
                i++;
            }

            else {
                int idx = (int) stack.pop();
                long x = arr[idx];

                int R = i;

                if (stack.isEmpty()) {
                    pArea = R * x;
                } else {
                    int L = (int) stack.peek();
                    pArea = (R - L - 1) * x;
                }

                if (pArea > maxArea) {
                    maxArea = pArea;
                }

            }

            //5
            //1 2 3 4 5
        }

        while (!stack.isEmpty()) {

            long x = arr[(int) stack.pop()];

            int R = i;

            if (stack.isEmpty()) {
                pArea = R * x;
            } else {
                int L = (int) stack.peek();
                pArea = (R - L - 1) * x;
            }

            if (pArea > maxArea) {
                maxArea = pArea;
            }

        }

        System.out.println(maxArea);

    }
}
