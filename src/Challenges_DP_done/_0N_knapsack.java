package Challenges_DP_done;

public class _0N_knapsack {
    /*
You've heard of 0-1 knapsack. Below is the problem statement for the same.

Given weights and values of n items, put these items in a knapsack of capacity cap to get the maximum total value in the knapsack.
In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
Also given an integer cap which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to cap.
You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
There is a little twist for 0-N knapsack. You can pick an element more than once.
Now you have to find maximum value multi subset of val[] such that sum of the weights of this subset is smaller than or equal to cap.

Note: Maximum value subset means the sunset with maximum sum of all the values in subset.

Input Format:-
The first line contains two integers, representing n(size of val[]) and cap respectively.
The subsequent line contains n integers representing the wt[] array.
The next line, again, contains n integers representing the val[] array.
*/

    public static int unboundedKnapsack(int[] vals, int[] wts, int W, int n) {
        int[] dp = new int[W + 1];

        for (int i = 0; i <= W; i++) {
            for (int j = 0; j < n; j++) {
                if (wts[j] <= i)
                    dp[i] = Math.max(dp[i], dp[i - wts[j]] + vals[j]);
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        int n = 5 ;
        int W = 11;
        int[] wts = {3,2,4,5,1};
        int[] vals = {4,3,5,6,1};
        System.out.println(unboundedKnapsack(vals,wts,W,n));
    }
}
