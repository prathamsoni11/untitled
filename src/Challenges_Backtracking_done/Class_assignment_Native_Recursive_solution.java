package Challenges_Backtracking_done;

import java.util.Scanner;

public class Class_assignment_Native_Recursive_solution {
    /*

In a mathematics class, Teacher ask Alice to find the number of all n digit distinct integers which is formed by the two distinct digits ai and bi but there is a rule to form n digit integer.

Rule: She has to form n digit integer by using two digits ai and bi without consecutive bi.

Alice is very weak in maths section. Help her to find the number of such n digit integers.
*/

    static long fib(long n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int k = 1;

        while (testCases-- > 0) {
            long n = sc.nextLong();
            System.out.println("#" + (k++) + " : " + fib(n + 2));
        }

        //3
        //1
        //2
        //3
    }
}
