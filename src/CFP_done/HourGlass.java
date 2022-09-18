package CFP_done;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n + 1;
        int nsv = nr;
        int val = n;
        int nsp = 0;
        int row = 1;
        while(row<=nr){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int csv = 1;
            while(csv<=nsv){
                System.out.print(val+" ");
                if(csv<=n-nsp){
                    val--;
                }
                else{
                    val++;
                }
                csv++;
            }
            System.out.println();
            if(row<=n){
                nsv -= 2;
                val = n-nsp-1;
                nsp++;
            }
            else{
                nsv += 2;
                val = row-n ;
                nsp--;
            }
            row++;
        }
    }
}
