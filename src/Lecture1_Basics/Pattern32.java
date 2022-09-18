package Lecture1_Basics;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nr = 2*n-1;
        int val = 1;
        int nst = 1;
        int row = 1;
        while(row<=nr){
            int cst = 1;
            while(cst<=nst){
                if(cst%2 == 1){
                    System.out.print(val);
                }
                else {
                    System.out.print(" * ");
                }
                cst++;
            }
            System.out.println();
            if(row<=n-1){
                val += 1;
                nst += 2;
            }
            else{
                val -= 1;
                nst -= 2;
            }
            row++;
        }
    }
}
