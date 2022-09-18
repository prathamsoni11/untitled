package CFP_done;

import java.util.Scanner;

public class Number_Star_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = n;
        int val = 1;
        int nst = -1;
        int row = 1;
        while(row<=n){
            int csv = 1;
            while(csv<=nr){
                System.out.print(val+" ");
                val++;
                csv++;
            }
            int cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            val = 1;
            nr = nr - 1;
            nst = nst + 2;
            row++;
        }
    }
}
