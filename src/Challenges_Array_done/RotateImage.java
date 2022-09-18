package Challenges_Array_done;

import java.util.Scanner;

public class RotateImage {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] array = takeInput();
        Rotate(array);

    }
    public static int[][] takeInput(){
        int rows = scn.nextInt();
        int[][] arr = new int[rows][rows];
        for(int row = 0 ; row<=rows-1 ; row++){
            for(int col=0; col<=rows-1 ; col++){
                arr[row][col] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void Rotate(int[][] arr){
        for(int right = arr.length-1 ; right >= 0 ; right--){
            for(int top = 0 ; top<=arr.length-1 ; top++){
                System.out.print(arr[top][right]+" ");
            }
            System.out.println();
        }
    }
}
