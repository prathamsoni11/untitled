package Lecture1_Basics;

import java.util.Scanner;

public class Pattern13_2 {
    public static void main(String[] args) {

        // Pattern13-------Solution No.2

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n - 1;
        int nst = 1;
        int row = 1;
        while(row<=nr){
            int cst = 1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            if(row<=n-1){  // This is for first 4 row..you can use "nr/2" in place of "n-1"
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
            row++;
        }
    }
}
