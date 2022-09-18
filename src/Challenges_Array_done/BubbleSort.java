package Challenges_Array_done;

import java.util.Scanner;

public class BubbleSort {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        bubbleSort(array);
        display(array);
    }
    public static int[] takeInput(){

        System.out.println("Size ?");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("Enter the value for "+i+" index?");
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void bubbleSort(int[] arr){
        for(int counter = 0 ; counter<arr.length-1 ; counter++){
            for(int j = 0 ; j<arr.length-1-counter ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
