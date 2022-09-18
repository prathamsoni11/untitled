package Challenges_Array_done;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1 ; i <= t ; i++) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int j = 0 ; j < n ; j++){
                arr[j] = scn.nextInt();
            }
            System.out.println(maxSubArraySum(arr,n));
        }
    }
    static int maxSubArraySum(int a[], int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
