package Challenges_Array_done;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1 ; i <= t ; i++) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            long[] arr = new long[n];
            for (int j = 0 ; j < n ; j++){
                arr[j] = scn.nextInt();
            }
            System.out.println(min(arr, arr.length,m));
        }
    }
    public static long min(long[] arr, long n, long k) {
        long lo = arr[arr.length - 1];
        long totalpages = 0;
        long hi = 0;
        for (int i = 0; i < n; i++) {
            totalpages += arr[i];
        }
        hi = totalpages;
        long ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            boolean isvalid = isValid(arr, k, mid);
            if (isvalid) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    private static boolean isValid(long[] arr, long k, long mid) {
        long sum = 0;
        int noOfstudents = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > mid) {
                noOfstudents++;
                sum = arr[i];
                if (noOfstudents > k) {
                    return false;
                }
            }
        }
        return true;
    }
}
