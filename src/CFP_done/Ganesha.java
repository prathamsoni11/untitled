package CFP_done;

import java.util.Scanner;

public class Ganesha {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst1 = n/2;
        int nst2 = n-nst1;
        for(int row = 1 ; row<=n ; row++){
            if(row == 1){
                for(int i = 1 ; i<=nst1 ;i++){
                    if(i != 1) System.out.print(" ");
                    else System.out.print("*");
                }
                for(int j =1 ; j<=nst2 ; j++){
                    System.out.print("*");
                }
            }
            else if(row>1 && row<n/2+1){
                for(int i = 1 ; i<=nst2 ;i++){
                    if(i == 1 || i == nst2 ) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            else if(row == n/2+1){
                for(int i = 1 ; i<= n ; i++){
                    System.out.print("*");
                }
            }
            else if(row>n/2+1 && row< n){
                for(int i = 1 ; i<=nst1 ; i ++){
                    System.out.print(" ");
                }
                for(int j = 1 ; j<=nst2 ; j++){
                    if(j == 1 || j == nst2 ) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            else{
                for(int i = 1 ; i<=nst2 ;i++){
                    System.out.print("*");
                }
                for(int j = 1 ; j<=nst1;j++){
                    if(j != nst1) System.out.print(" ");
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
