package Challenges_Hashing_and_tries_done;

import java.util.HashMap;
import java.util.Scanner;

public class unlock {
    /*
Shekhar is a bomb defusal specialist. He once encountered a bomb that can be defused only by a secret code.
He is given a number N and a number K. And he is also given permutation of first N natural numbers .
The defusal code is the largest permutation possible by doing atmost K swaps among a pair of the given permutation.
Help him to find the final permutation.

Input Format:-
First line contains ​an integer N and an integer k.
The next line contains N space separated integers denoting the given permutation.
*/

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=scn.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            map.put(arr[i], i);
        }
        int num=n;
        int m=0;
        while(m<n && k>0) {
            int hold = map.get(num-m);
            if(hold==n-num+m) { // Check if the number is present at the best spot
                m++;
                continue;
            } else { // If the number is not present at the best spot then swap the number with the element at that spot
                int temp=arr[m];
                arr[m]=arr[hold];
                arr[hold]=temp;
                map.put(arr[hold], hold);
                map.put(arr[m],m);
                m++;
                k--;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        //5 2
        //3 4 1 2 5

        //Explanation
        //
        //First we can swap 5 with 3 which gives us 5 4 1 2 3 and then we can swap 3 and 1 which gives us 5 4 3 2 1.
    }
}
