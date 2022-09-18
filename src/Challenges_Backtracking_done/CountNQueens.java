package Challenges_Backtracking_done;

import java.util.Scanner;

public class CountNQueens {
    /*You are given an empty chess board of size N*N. Find the number of ways to place N queens on the board, such that no two queens can kill each other in one move.
      A queen can move vertically, horizontally and diagonally.*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(countNquens(n));

        //4

    }
    public static int countNquens(int n) {
        boolean[][] board = new boolean[n][n];
        return countNqueens(board, 0);
    }

    public static int countNqueens(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isitsafetpq(board, row, col)) {
                board[row][col] = true;
                count += countNqueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isitsafetpq(boolean[][] board, int row, int col) {// check
        // col
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }
        // check diagnol
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }
}
