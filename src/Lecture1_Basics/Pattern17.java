package Lecture1_Basics;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n/2;
        int nsp = 1;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j <=nst ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <=nsp ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=nst ; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                nsp += 2;
                nst -= 1;
            }
            else{
                nsp -=2;
                nst +=1;
            }
        }
    }
}
