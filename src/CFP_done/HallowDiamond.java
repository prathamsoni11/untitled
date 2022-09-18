package CFP_done;

import java.util.Scanner;

public class HallowDiamond {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = -1;
        int nst = (n+1)/2;
        int row = 1;
        while(row<=n){
            if(row == 1 || row == n) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*"+"\t");
                }
            }
            else{
                for(int i = 1 ; i<=nst ; i++ ){
                    System.out.print("*"+"\t");
                }
                for(int i = 1 ; i<=nsp ; i++ ){
                    System.out.print(" "+"\t");
                }
                for(int i = 1 ; i<=nst ; i++ ){
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
            if(row<=n/2){
                nsp = nsp + 2;
                nst--;
            }
            else{
                nsp = nsp - 2;
                nst++;
            }
            row++;
        }
    }
}
