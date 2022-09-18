package Backtracking;

public class QueenKill {
    public static void main(String[] args) {
        QueenCombinationBoxRespect2DKill(new boolean[3][4],0,0,0,3,"");
    }
    public static void QueenCombinationBoxRespect2DKill(boolean[][] board ,int row, int col , int qpsf , int tq , String ans){
        //positive base case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        // manually variables change
        if(col == board[0].length){
            row++;
            col = 0;
        }
        // negative base case
        if(row == board.length){
            return;
        }
        // place
        if(isItSafeToPlaceTheQueen(board,row,col)) {
            board[row][col] = true;
            QueenCombinationBoxRespect2DKill(board, row, col + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }
        //not place
        QueenCombinationBoxRespect2DKill(board,row,col+1,qpsf,tq,ans);
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        // Vertically Upward
        int r = row-1;
        int c = col;
        while(r>=0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        // Horizontally left
        r = row;
        c = col-1;
        while(c>=0){
            if(board[r][c]){
                return false;
            }
            c--;
        }

        // Diagonally left
        r = row-1;
        c = col-1;
        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // Diagonally right
        r = row-1;
        c = col+1;
        while(r>=0 && c< board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}
