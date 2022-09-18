package Challenges_Hashing_and_tries_done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class intersection_of_two_array {
    /*
    Take as input N, the size of array. Take N more inputs and store that in an array.
    Take N more inputs and store that in another array.
    Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> freq = new HashMap<>();// <Number,Frequency> pair
        int n = sc.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (!freq.containsKey(temp)) {
                freq.put(temp, 1);
            } else {
                freq.replace(temp, 1 + freq.get(temp));
            }
        }

        // freq.forEach((k, v) -> System.out.println("k = " + k + " v = " + v));

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            if (freq.containsKey(temp) && freq.get(temp) > 0) {
                freq.replace(temp, freq.get(temp) - 1); // Decrement frequency to ensure it is not repeated
                ans.add(temp);
            }
        }

        Collections.sort(ans);

        System.out.print("[");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");

        //7
        //1 2 3 1 2 4 1
        //2 1 3 1 5 2 2
    }
}
