package Challenges_Bitmasking_done;

public class Unique_number_3 {
    /*
    We are given an array containg n numbers.
    All the numbers are present thrice except for one number which is only present once.
    Find the unique number. Only use - bitwise operators, and no extra space.
    */

    public static int findUniq(int arr[], int n) {
        int[] cnt = new int[64];
        for (int i = 0; i < n; i++) {
            int j = 0;
            int num = arr[i];
            while (num > 0) {
                cnt[j] += num & 1;
                j++;
                num >>= 1;
            }
        }
        int p = 1;
        long ans = 0;
        for (int i = 0; i < 64; i++) {
            cnt[i] %= 3;
            ans += cnt[i] * p;
            p = p << 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {

        //7
        //1 1 1 2 2 2 3
    }
}
