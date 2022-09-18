package Challenges_Backtracking_done;

import java.util.Scanner;

public class Class_assignment_optimised_solution {
    /*

In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which is formed by the two distinct digits ai and bi but there is a rule to form n digit integer.

Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.

Alice is very weak in maths section. Help her to find the number of such n digit integers.
*/

    public static void main(String[] args) {

        long[] fib = new long[30];
        fib[1] = 1;
        for (int i = 2; i < 30; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        int k = 1;

        while (testCases-- > 0) {
            int n = sc.nextInt();
            System.out.println("#" + (k++) + " : " + fib[n + 2]);
        }

        //3
        //1
        //2
        //3
    }
}
