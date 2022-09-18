package CFP_done;

import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp1 = n-1;
        int nsp2 = n-2;
        int val = 1;
        int row= 1;
        while(row<=n){
            for(int i = 1 ; i <= nsp1 ;i++){
                System.out.print(" ");
            }
            if(row == 1 || row == n ){
                for(int i = 1  ; i<=n ; i++){
                    System.out.print("*");
                }
            }
            else{
                for(int i = 1 ; i <= val ; i++){
                    System.out.print("*");
                }
                for(int i = 1 ; i <= nsp2 ; i++){
                    System.out.print(" ");
                }
                for(int i = 1 ; i <= val ; i++){
                    System.out.print("*");
                }
            }
            System.out.println();
            nsp1 = nsp1 - 1;
            row++;
        }
    }
}
