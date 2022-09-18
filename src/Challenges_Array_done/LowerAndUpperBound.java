package Challenges_Array_done;

import java.util.Scanner;

public class LowerAndUpperBound {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        int n = scn.nextInt();
        for (int i = 1 ; i<= n ; i++){
            int a = scn.nextInt();
            System.out.print(lowerBound(array,a)+" ");
            System.out.print(upperBound(array,a));
            System.out.println();
        }

    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int lowerBound(int[] arr , int data){
        int low = 0 , high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == data){
                ans  = mid;
                high = mid-1;
            }else if(data<arr[mid]){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr , int data){
        int low = 0 , high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == data){
                ans  = mid;
                low = mid+1;
            }else if(data<arr[mid]){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
