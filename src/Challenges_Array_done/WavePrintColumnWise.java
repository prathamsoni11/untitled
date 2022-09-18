package Challenges_Array_done;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];
        for(int row = 0 ; row<=rows-1 ; row++){
            for(int col=0; col<=cols-1 ; col++){
                arr[row][col] = scn.nextInt();
            }
        }
        for(int left = 0 ; left<= cols-1 ; left++){
            if(left%2 == 0){
                for(int top = 0 ; top<= arr.length-1 ; top++){
                    System.out.print(arr[top][left]+", ");
                }
            }
            else{
                for(int top = arr.length-1 ; top>=0 ; top--){
                    System.out.print(arr[top][left]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
