package Challenges_Array_done;

import java.util.Scanner;

public class WavePrintRowRise {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int[][] arr = new int[rows][cols];
        for(int row = 0 ; row<=rows-1 ; row++){
            for(int col=0; col<=cols-1 ; col++){
                arr[row][col] = scn.nextInt();
            }
        }
        for(int i = 0 ; i<= arr.length-1 ; i++){
            if(i%2 == 0){
                for(int j = 0 ; j<=arr[i].length-1 ; j++){
                    System.out.print(arr[i][j]+", ");
                }
            }
            else{
                for(int j = arr[i].length-1 ; j>=0 ; j--){
                    System.out.print(arr[i][j]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
