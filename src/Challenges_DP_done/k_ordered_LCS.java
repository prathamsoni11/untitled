package Challenges_DP_done;

public class k_ordered_LCS {
    /*
Any programmer worth his salt would be familiar with the famous Longest Common Subsequence problem.
Mancunian was asked to solve the same by an incompetent programmer.
 As expected, he solved it in a flash. To complicate matters, a twist was introduced in the problem.

In addition to the two sequences, an additional parameter k was introduced.
A k-ordered LCS is defined to be the LCS of two sequences if you are allowed to change atmost k elements in the first sequence to any value you wish to.
Can you help Mancunian solve this version of the classical problem?

Input Format:-
The first line contains three integers N, M and k, denoting the lengths of the first and second sequences and the value of the provided parameter respectively.
The second line contains N integers denoting the elements of the first sequence.
The third line contains M integers denoting the elements of the second sequence.
*/

    public static long korderedLCS(int[] a, int[] b, int i, int j, int k, long[][][] dp) {
        if (a.length == i || b.length == j) {
            return 0;
        }
        if (dp[i][j][k] != -1) {
            return dp[i][j][k];
        }
        long res = 0;
        if (a[i] == b[j]) {
            res = 1 + korderedLCS(a, b, i + 1, j + 1, k, dp);
        } else {
            if (k > 0) {
                res = 1 + korderedLCS(a, b, i + 1, j + 1, k - 1, dp);
            }
            res = Math.max(res, korderedLCS(a, b, i + 1, j, k, dp));
            res = Math.max(res, korderedLCS(a, b, i, j + 1, k, dp));
        }
        dp[i][j][k] = res;
        return res;

    }

    public static void main(String[] args) {
        int i = 5;  // size of a
        int j = 5;  // size of b
        int k = 1;
        int[] a = {1,2,3,4,5};
        int[] b = {5,3,1,4,2};

        System.out.println(korderedLCS(a,b,i,j,k,new long[i][j][k]));
    }
}
