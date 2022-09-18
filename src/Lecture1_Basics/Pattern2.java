package Lecture1_Basics;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        while(row<=n){
            int nst = 1;
            while(nst<=row){
                System.out.print("*");
                nst++;
            }
            System.out.println();
            row++;
        }
    }
}
