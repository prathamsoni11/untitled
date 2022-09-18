package Challenges_Array_done;

import java.util.Scanner;

public class insertionSort {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        insertion(array);
        display(array);
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void insertion(int[] arr){
        for(int counter = 1 ; counter<=arr.length-1 ; counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j>= 0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
