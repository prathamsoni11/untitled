package Challenges_Array_done;

import java.util.Scanner;

public class SortingInLineartime {
    public static void main(String[] args) {
        int[] array = takeInput();
        linearTime(array);
        display(array);
    }
    public static int[] takeInput(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public static void linearTime(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}
