package Challenges_Array_done;

import java.util.Scanner;

public class HelpRahul {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        int n = scn.nextInt();
        System.out.println(binarySearch(array,n));
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<= arr.length-1 ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int binarySearch(int[] arr , int item){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] == item) {
                ans = mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= item && arr[mid] >= item) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= item && arr[high] >= item) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return ans;
    }
}
