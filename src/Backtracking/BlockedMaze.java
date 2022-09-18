package Backtracking;

public class BlockedMaze {
    public static void main(String[] args) {
        int[][] maze = {{0,1,0,0},
                        {0,0,0,0},
                        {0,1,0,0},
                        {0,0,1,0}};

        blocked(maze,0,0,"",new boolean[maze.length][maze[0].length]);
    }
    public static void blocked(int[][] maze,int row,int col,String ans,boolean[][] visited){
        // Positive base case
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        // negative base case
        if(row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1 || visited[row][col]){
            return;
        }
        // put a mark
        visited[row][col] = true;

        // Top
        blocked(maze,row-1,col,ans+"T",visited);

        // Down
        blocked(maze,row+1,col,ans+"D",visited);

        // Left
        blocked(maze,row,col-1,ans+"L",visited);

        // Right
        blocked(maze,row,col+1,ans+"R",visited);

        visited[row][col] = false;
    }
}
