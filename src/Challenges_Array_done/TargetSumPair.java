package Challenges_Array_done;

import java.util.Scanner;

public class TargetSumPair {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        selectionSort(array);
        int n = scn.nextInt();
        SumPair(array,n);
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void selectionSort(int[] arr){
        for(int counter = 0 ; counter<arr.length-1 ; counter++){
            int min = counter;
            for(int j = counter+1; j<=arr.length-1 ; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
    }
    public static void SumPair(int[] arr , int n){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int ans = arr[l]+arr[r];
            if(ans>n){
                r--;
            }
            else if(ans<n){
                l++;
            }
            else{
                System.out.println(arr[l]+" and "+arr[r]);
                l++;
                r--;
            }
        }
    }
}
