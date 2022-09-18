package Challenges_DP_done;

import java.util.Arrays;
import java.util.Scanner;

public class minimum_money_needed {
    /*
Cody went to the market to buy some oranges for his N friends.
There he finds orange wrapped in packets, with the price of i^th packet as val[i].
Now he wants to buy exactly W kg oranges, so he wants you to tell him what minimum price he should pay to buy exactly W kg oranges.
Weight of i^th packet is i kg. If price of i^th packet is -1 then this packet is not available for sale.
The market has infinite supply of orange packets.

Input Format:-
First line of input contains two space separated integers N and W, the number of friend he has and the amount of Oranges in kilograms which he should buy.

The second line contains W space separated integers in which the i^th^ integer specifies the price of a ‘i’kg apple packet.
A value of -1 denotes that the corresponding packet is unavailable
*/

    public static void main(String args[]) {
        // Your Code Here

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int W = scn.nextInt();

        int[] prices = new int[W];

        for(int i =0;i < W;i++) prices[i] = scn.nextInt();
        int[][] strg = new int[prices.length + 1][W + 1];

        for(int[] arr : strg){
            Arrays.fill(arr, -1);
        }

        System.out.println(MinMoney(prices, 0, prices.length, strg));


        //5 5
        //1 2 3 4 5
    }

    public static int MinMoney(int[] prices, int vidx, int cap, int[][] strg) {

        if (cap == 0) {
            return 0;
        }

        if (vidx == prices.length) {
            return 10000000;
        }

        if (strg[vidx][cap] != -1) {
            return strg[vidx][cap];
        }

        int inc = 10000000;
        if (cap >= vidx + 1 && prices[vidx] != -1) {
            inc = MinMoney(prices, vidx, cap - vidx - 1, strg) + prices[vidx];
        }
        int exc = MinMoney(prices, vidx + 1, cap, strg);

        return strg[vidx][cap] = Math.min(inc, exc);
    }
}
