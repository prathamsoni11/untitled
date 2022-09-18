package Challenges_Array_done;

import java.util.Scanner;

public class BinarySearch {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = takeInput();
        int n = scn.nextInt();
        System.out.println(binarySearch(arr,n));
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int binarySearch(int[] arr , int item){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]<item){
                lo = mid+1;
            }
            else if (arr[mid]>item){
                hi = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
