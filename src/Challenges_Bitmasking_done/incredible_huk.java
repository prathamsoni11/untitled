package Challenges_Bitmasking_done;

import java.util.Scanner;

public class incredible_huk {
    /*
    The Planet Earth is under a threat from the aliens of the outer space and the Marvel Avengers team is busy fighting against them.
    Meanwhile, The Incredible Hulk has to defeat an enemy who is N steps above the level where he is standing (assume it as the 0th level).
    Hulk, because of his incredible jumping ability can take jumps in power of 2.
    In order to defeat the enemy as quickly as possible he has to reach the Nth step in minimum moves possible.
    Help Hulk to find the same and contribute in saving the Mother Earth.
    */

    public static int minSteps(int n) {

        if ((n & (n - 1)) == 1)
            return 1;

        int sum = 0;
        int mask = n;
        while (mask != 0) {

            sum += mask & 1;
            mask >>= 1;

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++){
            int n = sc.nextInt();
            System.out.println(minSteps(n));
        }

        //3
        //3
        //4
        //5

        //Explanation
        //
        //Let total steps is n, find the nearest integer which is of power 2 and less then n. let it would be k.
        // now remaining steps to cover is n-k and result = 1 + min steps for (n-k) remaining steps.
    }
}
