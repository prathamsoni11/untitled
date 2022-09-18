package CFP_done;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = n*2 + 1;
        int val1 = n;
        int val2 = n;
        int nsv = 1;
        int nsp = 2*n -1;
        int row = 1;
        while(row<=nr){
            int csv1 = 1;
            if(nsv==n+1){
                csv1 = 2;
            }
            while(csv1<=nsv){
                System.out.print(val1 + " ");
                val1 -= 1;
                csv1++;
            }
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int csv2 = 1;
            while(csv2<=nsv){
                System.out.print(val2 + " ");
                val2 += 1;
                csv2++;
            }
            System.out.println();
            if(row<=n){
                nsv += 1;
                val1 = n;
                val2 = val2-row-1;
                nsp -= 2;
            }
            else{
                nsv -= 1;
                val1 = n;
                val2 = val2 - nsv;
                nsp += 2;
            }
            row++;
        }
    }
}
