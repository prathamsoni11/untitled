package Challenges_Array_done;

import java.util.Scanner;

public class AllocationProblem {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scan.nextInt();
        while (tc > 0) {
            int[] arr = takeInput();
            allocation(arr);
            tc--;
        }
    }
    public static int[] takeInput() {
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void allocation(int[] arr){
        int s1 = 0;
        int s2 = 0;
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j<=i ; j++){
                s1 = s1 + arr[j];
            }
            for(int j = i+1; j< arr.length ; j++){
                s2 = s2 + arr[j];
            }
        }
    }
}
