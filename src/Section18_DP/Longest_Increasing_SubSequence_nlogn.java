package Section18_DP;

public class Longest_Increasing_SubSequence_nlogn {
    public static void main(String[] args) {
        int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        System.out.println(LISBU(arr));
    }
    public static int LISBU(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        int[] le = new int[arr.length];
        le[0] = arr[0];
        int length = 1;
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] > le[length-1]){
                le[length] = arr[i];
                length++;
            }
            else {
                int idx = binarySearch(le,0,length-1,arr[i]);
                le[idx] = arr[i];
            }
            System.out.print(arr[i] + ": ");
            for (int val: le){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        return length;
    }

    public static int binarySearch(int[] le, int si, int ei, int item){
        int low = si;
        int high = ei;
        while (low<=high){
            int mid = (low+high)/2;
            if (item > le[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;
    }
}
