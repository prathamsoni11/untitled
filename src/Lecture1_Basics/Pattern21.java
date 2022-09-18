package Lecture1_Basics;

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = (2*n)-3;
        int row = 1;
        while(row<=n){
            for (int i = 1 ; i <= nst ; i++ ){
                System.out.print("*");
            }
            for (int j = 1 ; j<=nsp ; j++){
                System.out.print(" ");
            }
            int k = 1;
            if(row == n){
                k = 2;
            }
            for ( ; k<=nst ; k++ ){
                System.out.print("*");
            }
            System.out.println();
            nst +=1;
            nsp -=2;
            row++;
        }
    }
}
