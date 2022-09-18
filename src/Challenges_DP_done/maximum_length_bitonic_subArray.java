package Challenges_DP_done;

import java.util.Scanner;

public class maximum_length_bitonic_subArray {
    /*

You are provided n numbers of array. You need to find the maximum length of bitonic subarray.
A subarray A[i … j] is bitonic if there is a k with i <= k <= j such that A[i] <= A[i + 1] … <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j] i.e subarray is first increasing and then decreasing or entirely increasing or decreasing.

Input Format:-
First line contains integer t which is number of test case.
 For each test case, it contains an integer n which is the size of array and next line contains n space separated integers.
*/

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(bitonic(arr));
        }

        //2
        //6
        //12 4 78 90 45 23
        //4
        //40 30 20 10

        //Explanation
        //
        //ForMaximum length = 4, 78, 90, 45, 23
    }

    public static int bitonic(int arr[])
    {
        int n=arr.length;
        int[] inc = new int[n];

        int[] dec = new int[n];
        int max;

        inc[0] = 1;
        dec[n-1] = 1;
        for (int i = 1; i < n; i++)
            inc[i] = (arr[i] >= arr[i-1])? inc[i-1] + 1: 1;
        for (int i = n-2; i >= 0; i--)
            dec[i] = (arr[i] >= arr[i+1])? dec[i+1] + 1: 1;
        max = inc[0] + dec[0] - 1;
        for (int i = 1; i < n; i++)
            if (inc[i] + dec[i] - 1 > max)
                max = inc[i] + dec[i] - 1;

        return max;
    }
}
