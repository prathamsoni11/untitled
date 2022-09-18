package Challenges_DP_done;

public class minimum_jumps_required {
    /*
You are provided an array of integers where each element represents the max number of steps you can take to move ahead.
You need to check that how many minimum steps required to reach at the end of the array.

Hint - If N==0 you can never move forward, your return INT_MAX (Infinity).

Input Format:-
First line contains integer t which is number of test case.
For each test case, it contains an integers n which the size of array A[].
Next line contains n space separated integers.
*/

    static int minJumps(int arr[],
                        int n)
    {
        // jumps[0] will
        // hold the result
        int[] jumps = new int[n];
        int min;

        // Minimum number of jumps
        // needed to reach last
        // element from last elements
        // itself is always 0
        jumps[n - 1] = 0;


        // Start from the second
        // element, move from right
        // to left and construct the
        // jumps[] array where jumps[i]
        // represents minimum number of
        // jumps needed to reach arr[m-1]
        // from arr[i]
        for (int i = n - 2; i >= 0; i--)
        {
            // If arr[i] is 0 then arr[n-1]
            // can't be reached from here
            if (arr[i] == 0)
                jumps[i] = Integer.MAX_VALUE;

                // If we can direcly reach to
                // the end point from here then
                // jumps[i] is 1
            else if (arr[i] >= n - i - 1)
                jumps[i] = 1;

                // Otherwise, to find out
                // the minimum number of
                // jumps needed to reach
                // arr[n-1], check all the
                // points reachable from
                // here and jumps[] value
                // for those points
            else
            {
                // initialize min value
                min = Integer.MAX_VALUE;

                // following loop checks
                // with all reachable points
                // and takes the minimum
                for (int j = i + 1; j < n &&
                        j <= arr[i] + i; j++)
                {
                    if (min > jumps[j])
                        min = jumps[j];
                }

                // Handle overflow
                if (min != Integer.MAX_VALUE)
                    jumps[i] = min + 1;
                else
                    jumps[i] = min; // or Integer.MAX_VALUE
            }
        }

        return jumps[0];
    }

    public static void main(String[] args) {
        int t = 1;  // how many you want to run code
        int n = 11;
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minJumps(arr,n));

        //Explanation
        //
        //1-> 3 (you can pick 5 or 8 or 9 , pick either 8 or 9) -> 8 -> 9
    }

}
