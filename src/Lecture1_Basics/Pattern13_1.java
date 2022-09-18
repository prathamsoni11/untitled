package Lecture1_Basics;

import java.util.Scanner;

public class Pattern13_1 {
    public static void main(String[] args) {

        // Pattern13-------Solution No.1

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n - 1;
        int row = 1;
        while(row<=nr){
            if(row<=n){                      // Increasing Stars till 5th row
                int cst = 1;
                while(cst<=row){
                    System.out.print("*");
                    cst++;
                }
            }
            else{                            //Decreasing Stars
                int nstd = row;
                while(nstd<=nr){
                    System.out.print("*");
                    nstd++;
                }
            }
            System.out.println();
            row++;
        }
    }
}
