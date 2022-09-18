package Challenges_Hashing_and_tries_done;

import java.util.HashMap;
import java.util.Scanner;

public class exist_or_not {
    /*

Given an array arr of n length. You will be given Q queries for the array.
Each query contains a number N.You have to determine whether a number exist in the array or not

Input Format:-
First line of input contains number of test cases T.
First line of each case contains an integer L denoting the length of the array.
The next line contains L space separated integers.
The next line contains an integer Q denoting the number of queries.
The next Q lines contains a number N to be searched in the array.
*/

    public static void existOrNot() {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        while (t-- > 0) {

            HashMap map = new HashMap<>();

            int n = scn.nextInt();

            for (int i = 0; i < n; i++) {
                int val = scn.nextInt();
                map.put(val, (int)map.getOrDefault(val, 0) + 1);
            }

            int q = scn.nextInt();
            while (q-- > 0) {

                if (map.containsKey(scn.nextInt())) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    public static void main(String[] args) {
        existOrNot();

        //1
        //6
        //12 3 -67 67 34 2
        //4
        //4
        //5
        //67
        //7
    }
}
