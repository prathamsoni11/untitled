package CFP_done;

import java.util.Scanner;

public class Number_Star_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsv = 1;
        int val = 1;
        for(int row = 1 ; row<=n ; row++) {
            for (int i = 1; i <= nsv; i++) {
                System.out.print(val);
                val++;
            }
            for (int j = 1; j <= n - nsv; j++) {
                System.out.print("*");
            }
            System.out.println();
            val = 1;
            nsv++;
        }
    }
}
