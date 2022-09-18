package Lecture3_Function_1DArray;

public class LinearTime {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
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
        display(arr);
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
