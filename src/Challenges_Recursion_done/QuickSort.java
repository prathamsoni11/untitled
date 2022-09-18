package Challenges_Recursion_done;

import java.util.Scanner;

public class QuickSort {
    // Take as input N, the size of array. Take N more inputs and store that in an array.
    // Take as input M, a number. Write a recursive function which returns an array containing indices of all items in the array which have value equal to M.
    // Print all the values in the returned array.

    public static void main(String[] args) {
        //5
        //3
        //2
        //1
        //2
        //3
        //2
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        quickSort(arr,0, arr.length-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
    public static void quickSort(int[] arr , int lo , int hi){

        if(lo>= hi){
            return;
        }

        // partitioning
        int mid = (lo+hi)/2;
        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while(left<=right){
            while(arr[left] < pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<=right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        quickSort(arr,lo,right);
        quickSort(arr,left,hi);
    }
}
