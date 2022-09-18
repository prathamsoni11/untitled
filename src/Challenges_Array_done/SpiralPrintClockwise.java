package Challenges_Array_done;

import java.util.Scanner;

public class SpiralPrintClockwise {
    static Scanner scn =new Scanner(System.in);
    public static void main(String[] args) {
        int[][] array = takeInput();
        spiral(array);
    }
    public static int[][] takeInput(){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j< m ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void spiral(int[][] arr) {
        int rowmin = 0;
        int colmin = 0;
        int rowmax = arr.length - 1;
        int colmax = arr[0].length - 1;
        while (rowmin <= rowmax && colmin <= colmax) {
            for (int col = colmin; col <= colmax && rowmin <= rowmax && colmin <= colmax; col++) {
                System.out.print(arr[rowmin][col] + ", ");
            }
            rowmin++;
            for (int row = rowmin; row <= rowmax && rowmin <= rowmax && colmin <= colmax; row++) {
                System.out.print(arr[row][colmax] + ", ");
            }
            colmax--;
            for (int col = colmax; col >= colmin && rowmin <= rowmax && colmin <= colmax; col--) {
                System.out.print(arr[rowmax][col] + ", ");
            }
            rowmax--;

            for (int row = rowmax; row >= rowmin && rowmin <= rowmax && colmin <= colmax; row--) {
                System.out.print(arr[row][colmin] + ", ");
            }
            colmin++;
        }
        System.out.println("End");
    }

}
