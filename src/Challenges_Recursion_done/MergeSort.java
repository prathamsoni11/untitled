package Challenges_Recursion_done;

import java.util.Scanner;

public class MergeSort {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        int[] ans = mergeSort(array,0, array.length-1);
        for(int val: ans){
            System.out.print(val+" ");
        }
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int[] mergeSortedArray(int[] arr1 , int[] arr2){
        int[] merged = new int[arr1.length+ arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                merged[k] = arr1[i];
                i++;
                k++;
            }
            else{
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i == arr1.length){
            while(j< arr2.length){
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j == arr2.length){
            while(i< arr1.length){
                merged[k] = arr1[i];
                i++;
                k++;
            }
        }
        return merged;
    }
    public static int[] mergeSort(int[] arr, int lo , int hi){
        if(lo == hi){
            int[] br = new int[1];
            br[0] = arr[lo];
            return br;
        }
        int mid = (lo+hi)/2;
        int[] fh = mergeSort(arr,lo,mid);
        int[] sh = mergeSort(arr,mid+1,hi);

        int[] merged = mergeSortedArray(fh,sh);
        return merged;
    }
}
