package Challenges_Recursion_done;

import java.util.Scanner;

public class Optimal_Game_Strategy_1 {
    //Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn where 'n' is always even.
    // They take alternate terms. In each turn, a player picks either the first coin or the last coin from the row and removes it from the row.
    // The value of coin is received by that player. Determine the maximum value that Piyush can win with if he moves first. Both the players play optimally.

    static long[] arr;

    public static long optimalGame(int i, int j) {
        if (i > j) {
            return 0;
        }
        //  Consider both the possibilities. You can pick either the first or the last coin.
        //  Since the opponent plays optimally , we would get the minimum of the remaining coins for each choice.
        long pickFirst = arr[i] + Math.min(optimalGame(i + 2, j), optimalGame(i + 1, j - 1));
        long pickLast = arr[j] + Math.min(optimalGame(i, j - 2), optimalGame(i + 1, j - 1));

        // Pick the max of two as your final result
        long ans = Math.max(pickFirst, pickLast);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        System.out.println(optimalGame(0, n - 1));


        //4
        //1 2 3 4

        //Explanation :-
        //Piyush will pick the coin 4. Then Nimit can pick either 1 or 3.
        //In both the cases piyush picks coin 2 and wins with a total of 6.

    }
}
