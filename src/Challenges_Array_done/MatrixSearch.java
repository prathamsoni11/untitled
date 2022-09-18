package Challenges_Array_done;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int ans = 0;
        int[][] arr = new int[rows][cols];
        for(int row = 0 ; row<=rows-1 ; row++){
            for(int col=0; col<=cols-1 ; col++){
                arr[row][col] = scn.nextInt();
            }
        }
        int a = scn.nextInt();
        for(int row = 0 ; row<= arr.length-1 ; row++){
            for(int col = 0 ; col <= cols-1 ; col++){
                if(arr[row][col] == a){
                    ans  = 1;
                }
            }
        }
        System.out.println(ans);
    }
}
