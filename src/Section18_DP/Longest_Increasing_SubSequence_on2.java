package Section18_DP;

import java.util.Arrays;

public class Longest_Increasing_SubSequence_on2 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,0,6,2,3};
        System.out.println(LISBU(arr));
    }
    public static int LISBU(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        int max = 1;
        int[] strg = new int[arr.length];
        Arrays.fill(strg,1);
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < i ; j++){
                if (arr[j] < arr[i]){
                    strg[i] = Math.max(strg[i],strg[j]+1);

                    max = Math.max(max,strg[i]);
                }
            }
        }
        return max;
    }
}
