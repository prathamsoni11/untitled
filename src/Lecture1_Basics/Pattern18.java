package Lecture1_Basics;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2;
        int nst = 1;
        int row = 1;
        while (row<=n){
            for (int i = 1 ; i<=nsp ; i++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <=nst ; j++){
                System.out.print("*");
            }
            System.out.println();
            if(row<=n/2){
                nsp -=1;
                nst +=2;
            }
            else{
                nsp +=1;
                nst -=2;
            }
            row++;
        }
    }
}
