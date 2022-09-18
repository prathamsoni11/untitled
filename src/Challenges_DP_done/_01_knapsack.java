package Challenges_DP_done;

public class _01_knapsack {
    /*
You are packing for a vacation on the sea side and you are going to carry only one bag with capacity S (1 <= S <= 1000).
You also have N (1<= N <= 1000) items that you might want to take with you to the sea side.
Unfortunately you can not fit all of them in the knapsack so you will have to choose.
For each item you are given its size and its value. You want to maximize the total value of all the items you are going to bring.
 What is this maximum total value?

Input Format:-
On the first line you are given N and S.
Second line contains N space separated integer where ith integer denotes the size of ith item.
Third line contains N space seperated integers where ith integer denotes the value of ith item.
*/

    public static int KnapsackBU(int[] wt, int[] price, int cap) {

        int nr = wt.length + 1;
        int nc = cap + 1;

        int[][] strg = new int[nr][nc];

        for (int row = 1; row < strg.length; row++) {

            for (int col = 1; col < strg[0].length; col++) {

                int include = 0;

                if (col >= wt[row - 1]) {
                    include = price[row - 1] + strg[row - 1][col - wt[row - 1]];
                }

                int exclude = strg[row - 1][col];

                strg[row][col] = Math.max(include, exclude);

            }
        }

        return strg[nr - 1][nc - 1];
    }

    public static void main(String[] args) {
        int arrSize = 5;
        int cap = 4;
        int[] wt = {1,2,3,2,2};
        int[] price = {8,4,0,5,3};
        System.out.println(KnapsackBU(wt,price,cap));
    }
}
