package Challenges_Recursion_done;

import java.util.Scanner;

public class Subset_sum_easy {
    /*

Mike is a very passionate about sets. Lately, he is busy solving one of the problems on sets.
He has to find whether if the sum of any of the non-empty subsets of the set A is zero.

Input Format:-

The first line contains an integer T, which is the total number of test cases.
T test cases follow.
Each test case consists of two lines.
The first line consists of a single integer N, which is the number of elements present in the set A.
The second line contains N space separated integers denoting the elements of the set A.
*/

    public static boolean subsetSumEasy(int[] v, int i, int sum, boolean included) {
        if (i == v.length) {
            return (sum == 0 && included);
        }

        boolean inc = subsetSumEasy(v, i + 1, sum + v[i], true);
        boolean exc = subsetSumEasy(v, i + 1, sum, included);

        return inc || exc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }

            if (subsetSumEasy(v, 0, 0, false)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        //1
        //4
        //1 3 2 -3
    }
}
