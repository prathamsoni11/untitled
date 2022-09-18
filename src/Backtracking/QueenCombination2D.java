package Backtracking;

public class QueenCombination2D {
    public static void main(String[] args) {
        QueenCombinationBoxRespect2DRecCall(new boolean[2][2], 0, 0, 0, 2, "");
    }
    public static void QueenCombinationBoxRespect2D(boolean[][] board ,int row, int col , int qpsf , int tq , String ans){
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
        board[row][col] = true;
        QueenCombinationBoxRespect2D(board,row,col+1,qpsf+1,tq,ans + "{" + row + "-" + col + "}");
        board[row][col] = false;

        //not place
        QueenCombinationBoxRespect2D(board,row,col+1,qpsf,tq,ans);
    }

    public static void QueenCombinationBoxRespect2DRecCall(boolean[][] board ,int row, int col , int qpsf , int tq , String ans){
        //positive base case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        // manually variables change
        if(col == board[0].length){
            QueenCombinationBoxRespect2DRecCall(board,row+1,0,qpsf,tq,ans);
            return;
        }
        // negative base case
        if(row == board.length){
            return;
        }
        // place
        board[row][col] = true;
        QueenCombinationBoxRespect2DRecCall(board,row,col+1,qpsf+1,tq,ans + "{" + row + "-" + col + "}");
        board[row][col] = false;

        //not place
        QueenCombinationBoxRespect2DRecCall(board,row,col+1,qpsf,tq,ans);
    }


}
