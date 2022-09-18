package Challenges_Backtracking_done;

import java.util.Scanner;

public class Sudoku_solver {
    /*You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
To learn more about sudoku, go to this link Sudoku-Wikipedia.*/

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = scn.nextInt();
            }
            // System.out.println();
        }

        Sudoku(board, 0, 0);

        display(board);

        // 9
        //5 3 0 0 7 0 0 0 0
        //6 0 0 1 9 5 0 0 0
        //0 9 8 0 0 0 0 6 0
        //8 0 0 0 6 0 0 0 3
        //4 0 0 8 0 3 0 0 1
        //7 0 0 0 2 0 0 0 6
        //0 6 0 0 0 0 2 8 0
        //0 0 0 4 1 9 0 0 5
        //0 0 0 0 8 0 0 7 9
    }

    public static boolean Sudoku(int[][] board, int row, int col) {

        if (col == board[0].length) {
            row = row + 1;
            col = 0;
        }

        if (row == board.length) {
            // display(board);
            return true;
        }

        if (board[row][col] != 0) {
            return Sudoku(board, row, col + 1);

        }

        for (int i = 1; i <= 9; i++) {

            if (isItSafe(board, row, col, i)) {

                board[row][col] = i;

                boolean res = Sudoku(board, row, col + 1);

                if (res)
                    return true;

                board[row][col] = 0;

            }
        }

        return false;

    }

    public static boolean isItSafe(int[][] board, int row, int col, int val) {

        return isItSafeRow(board, row, val) && isItSafeCol(board, col, val) && isItSafeCell(board, row, col, val);
    }

    public static boolean isItSafeRow(int[][] board, int row, int val) {

        for (int col = 0; col < board[0].length; col++) {
            if (board[row][col] == val) {
                return false;
            }
        }

        return true;
    }

    public static boolean isItSafeCol(int[][] board, int col, int val) {

        for (int row = 0; row < board.length; row++) {
            if (board[row][col] == val) {
                return false;
            }
        }

        return true;
    }

    public static boolean isItSafeCell(int[][] board, int row, int col, int val) {

        int rs = row - row % 3;
        int cs = col - col % 3;

        for (int r = rs; r < rs + 3; r++) {
            for (int c = cs; c < cs + 3; c++) {

                if (board[r][c] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
