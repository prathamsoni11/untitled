package Challenges_Backtracking_done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum_it_up {
    /*
You are given an array of numbers and a target number(T) , print all unique combinations in the array whose sum equals the target number T.
Note that each number in the array may only be used once in the combination.

Note:
    All numbers (including target) will be positive integers
    Elements in the combination must be in non-descending order
    There should be no duplicate combinations
*/
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        Arrays.sort(array);

        List<List< Integer >> res = new ArrayList<>();
        helper2(array, 0, target, new ArrayList<>(), res);

        for(List< Integer > each : res){

            for(int val : each){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        //7
        //10 1 2 7 6 1 5
        //8
    }

    public static void helper2(int[] arr, int vidx, int target, List< Integer > curr, List< List < Integer > > res) {

        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = vidx; i < arr.length; i++) {

            if (i == vidx || arr[i] != arr[i - 1]) {
                curr.add(arr[i]);
                helper2(arr, i + 1, target - arr[i], curr, res);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
