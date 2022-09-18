package Challenges_Bitmasking_done;

import java.util.Scanner;

public class count_set_bits {
    // count number of 1s in binary representation of an integer
    static int count = 0;
    public static int count_set_nits (int n){
        while( n > 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++){
            int n = sc.nextInt();
            System.out.println(count_set_nits(n));
        }

        //3
        //5
        //4
        //15
    }
}
