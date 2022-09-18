package Challenges_linkedList_done;

import java.util.Scanner;

public class rat_chases_its_cheese {
    /*
    You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty.
    The rat can move from a position towards left, right, up or down on the grid.
    Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for.
    There exits a unique path in the grid . Find that path and help the rat reach its cheese.
    */

    static boolean flag = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        char[][] maze = new char[n][m];

        for (int i = 0; i < n; i++) {

            String ans = scn.next();
            for (int j = 0; j < m; j++) {
                maze[i][j] = ans.charAt(j);
            }

        }

        chase(new int[n][m], maze, 0, 0);
        if (flag == false) {
            System.out.println("NO PATH FOUND");
        }

        //5 4
        //OXOO
        //OOOX
        //XOXO
        //XOOX
        //XXOO

    }

    public static void chase(int[][] visited, char[][] maze, int row, int col) {

        if (row < 0 || row >= visited.length || col < 0 || col >= visited[0].length || visited[row][col] == 1
                || maze[row][col] == 'X') {
            return;
        }

        if (row == maze.length - 1 && col == maze[0].length - 1) {

            flag = true;
            visited[visited.length - 1][visited[0].length - 1] = 1;
            for (int i = 0; i < visited.length; i++) {
                for (int j = 0; j < visited[0].length; j++)
                    System.out.print(visited[i][j] + " ");
                System.out.println();
            }
            return;

        }

        visited[row][col] = 1;
        chase(visited, maze, row, col - 1);
        chase(visited, maze, row, col + 1);
        chase(visited, maze, row + 1, col);
        chase(visited, maze, row - 1, col);
        visited[row][col] = 0;
    }
}
