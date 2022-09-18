package Lecture1_Basics;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while(row<=n){
            int val = 1;
            for (int i = 1 ; i<=nsp ; i++){
                System.out.print("\t");
            }
            for (int j = 1 ; j <= nst ; j++){
                System.out.print(val + "\t");
                if (j<=nst/2){
                    val++;
                }else val--;
            }
            System.out.println();
            nsp -=1;
            nst +=2;
            row++;
        }
    }
}
