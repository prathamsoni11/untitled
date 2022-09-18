package Challenges_Recursion_done;

import java.util.Scanner;

public class SortedArray {
    /*
    Take as input N, the size of an integer array.
    Take one more input, which is a list of N integers separated by a space, and store that in an array.
    Write a recursive function which prints true if the array is sorted in Increasing Order, and false otherwise.
    */

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr, 0);
        System.out.println(ans);

        //5
        //1 2 3 4 5
    }
}
