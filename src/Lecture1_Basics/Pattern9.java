package Lecture1_Basics;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while(row<=n){
            for (int i = 1 ; i<=nsp ; i++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= nst ; j++){
                System.out.print("*");
            }
            System.out.println();
            nsp -=1;
            nst +=2;
            row++;
        }
    }
}
