package Challenges_Array_done;

import java.util.Scanner;

public class PainterPartionProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(partition(arr, n, k));
    }
    static int getMax(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
    static int getSum(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++)
            total += arr[i];
        return total;
    }
    static int numberOfPainters(int arr[], int n, int maxLen) {
        int total = 0, numPainters = 1;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            if (total > maxLen) {
                // for next count
                total = arr[i];
                numPainters++;
            }
        }
        return numPainters;
    }
    static int partition(int arr[], int n, int k) {
        int lo = getMax(arr, n);
        int hi = getSum(arr, n);

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int requiredPainters = numberOfPainters(arr, n, mid);

            if (requiredPainters <= k)
                hi = mid;

            else
                lo = mid + 1;
        }
        return lo;
    }
}
