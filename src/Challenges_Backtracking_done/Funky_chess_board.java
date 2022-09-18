package Challenges_Backtracking_done;

import java.util.Scanner;

public class Funky_chess_board {
    /**/
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = scn.nextInt();
                if(arr[i][j] == 1)
                    sum++;
            }
        }

        funky(arr, sum);

        //3
        //1 1 1
        //1 1 1
        //1 1 1

    }

    static int n, cols, empty, sum = 0, hi;

    public static void set(int[][] board, int i, int j, int count) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 0)
            return;
        int ans = 0;
        board[i][j] = 0;// unsets the (i,j) cell
        hi = Math.max(hi, count + 1);// hi stores the maximum of value of visited squares
        // try all 8 possible moves for knight
        set(board, i - 1, j - 2, count + 1);
        set(board, i - 2, j - 1, count + 1);
        set(board, i + 1, j - 2, count + 1);
        set(board, i + 2, j - 1, count + 1);
        set(board, i - 1, j + 2, count + 1);
        set(board, i - 2, j + 1, count + 1);
        set(board, i + 1, j + 2, count + 1);
        set(board, i + 2, j + 1, count + 1);
        board[i][j] = 1;// sets (i,j) cell again(backtracking)
    }

    public static void funky(int[][] board, int sum) {

        hi = 0;
        set(board, 0, 0, 0);
        System.out.print(sum - hi);
    }
}
