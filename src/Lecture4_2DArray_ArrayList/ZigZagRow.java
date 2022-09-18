package Lecture3_Function_1DArray;

import java.util.Scanner;

public class ZigZagRow {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        display(arr);
    }
    public static int[][] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No. of Rows");
        int rows = scn.nextInt();
        int[][] arr = new int[rows][];
        for(int row = 0 ; row<=rows-1 ; row++){
            System.out.println("Enter No. of cols for row "+row);
            int cols = scn.nextInt();
            arr[row] = new int[cols];
            for(int col=0; col<=cols-1 ; col++){
                System.out.println("Enter the value for row "+row+" and col "+col);
                arr[row][col] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void display(int[][] arr){
        for(int row = 0 ; row<arr.length ; row++){
            for(int col = 0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
