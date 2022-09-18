package Lecture9_Time_and_SpaceComplexity;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {40,20,90,30,70,10,80,60,50};
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
