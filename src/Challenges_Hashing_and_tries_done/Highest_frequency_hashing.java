package Challenges_Hashing_and_tries_done;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_frequency_hashing {
    /*Given an array find the number which comes with maximum frequency. It must work in O(n) time complexity.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> m = new HashMap<>(); // Key,Freq pair
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            if (m.containsKey(x)) {
                m.replace(x, m.get(x) + 1);
            } else {
                m.put(x, 1);
            }
        }
        int maxFreq = 0;
        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                ans = entry.getKey();
            }
        }

        System.out.println(ans);

        //5
        //1 2 2 2 3
    }
}
