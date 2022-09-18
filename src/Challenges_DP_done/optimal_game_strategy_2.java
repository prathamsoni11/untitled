package Challenges_DP_done;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class optimal_game_strategy_2 {
    /*
Piyush and Nimit are playing a coin game.
They are given n coins with values x1, x2 …. xn where 'n' is always even. They take alternate terms.
In each turn, a player picks either the first coin or the last coin from the row and removes it from the row.
The value of coin is received by that player.
Determine the maximum value that Piyush can win with if he moves first. Both the players play optimally.

Input Format:-
First line contains the number of coins 'n'.
Second line contains n space separated integers where ith index denotes the value of ith coin.
*/

    public static long optimalGame_Naive(int i, int j) {
        if (i > j) {
            return 0;
        }
        //  Consider both the possibilities. You can pick either the first or the last coin.
        //  Since the opponent plays optimally , we would get the minimum of the remaining coins for each choice.
        long pickFirst = arr[i] + Math.min(optimalGame_Naive(i + 2, j), optimalGame_Naive(i + 1, j - 1));
        long pickLast = arr[j] + Math.min(optimalGame_Naive(i, j - 2), optimalGame_Naive(i + 1, j - 1));

        // Pick the max of two as your final result
        long ans = Math.max(pickFirst, pickLast);

        return ans;
    }


    // Java Code
    // For Java , use the custom Reader class for fast input output or you will get a TLE

    static long[] arr;      // Array containing the elements
    static long[][] dp;    // dp array with all elements initialised to -1

    public static long optimalGame_optimised(int i, int j) {
        if (i > j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        // Consider both the possibilities. You can pick either the first or the last coin.
        // Since the opponent plays optimally , we would get the minimum of the remaining coins for each choice.
        long pickFirst = arr[i] + Math.min(optimalGame_optimised(i + 2, j), optimalGame_optimised(i + 1, j - 1));
        long pickLast = arr[j] + Math.min(optimalGame_optimised(i, j - 2), optimalGame_optimised(i + 1, j - 1));

        // Pick the max of two as your final result
        long ans = Math.max(pickFirst, pickLast);

        dp[i][j] = ans;

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        dp = new long[10005][10005];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(optimalGame_optimised(0, n - 1));

        //4
        //1 2 3 4

        //Explanation
        //
        //Piyush will pick the coin 4. Then Nimit can pick either 1 or 3.
        // In both the cases Piyush picks coin 2 and wins with a total of 6.
    }

}
