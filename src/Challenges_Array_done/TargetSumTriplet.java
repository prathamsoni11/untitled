package Challenges_Array_done;

import java.util.Scanner;

public class TargetSumTriplet {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        insertionSort(array);
        int n = scan.nextInt();
        tripletSum(array,n);
    }
    public static int[] takeInput() {
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void insertionSort(int[] arr){
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
    public static void tripletSum(int[] arr,int n){
        for(int i = 0 ; i < arr.length-2;i++){
            int item = arr[i];
            int l = i+1;
            int r = arr.length-1;
            while(l<r){
                int ans = item+arr[l]+arr[r];
                if(ans>n){
                    r--;
                }
                else if(ans<n){
                    l++;
                }
                else{
                    System.out.println(item+", "+arr[l]+" and "+arr[r]);
                    l++;
                    r--;
                }
            }
        }
    }
}
