package Challenges_Hashing_and_tries_done;

import java.util.HashSet;
import java.util.Set;

public class SubArray_with_distinct_element {
    // Given an array, the task is to calculate the sum of lengths of contiguous subarrays having all elements distinct

    public static int sumOflength(int[] arr, int n) {
        Set s = new HashSet<>();

        int j = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && !s.contains(arr[j])) {
                s.add(arr[j]);
                j++;
            }
            ans += ((j - i) * (j - i + 1)) / 2;
            s.remove(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;   // size of array
        int[] arr = {1,2,3};
        System.out.println(sumOflength(arr,n));
    }
}
