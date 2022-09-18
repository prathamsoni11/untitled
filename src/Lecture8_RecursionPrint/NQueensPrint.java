package Lecture8_RecursionPrint;

public class NQueensPrint {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        printNQueens(board,0,"");
    }
    public static void printNQueens(boolean[][] board , int row, String result){
        if(row == board.length){
            System.out.println(result);
            return;
        }
        int count = 0;
        for(int col = 0 ; col<board[row].length ; col++){
            if(isItSafe(board,row,col)){
                board[row][col] = true;
                printNQueens(board,row+1,result+"{"+(row+1)+","+(col+1)+"};");
                board[row][col] = false;
            }
        }
    }
    private static boolean isItSafe(boolean[][] board , int row , int col){
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i = row-1 , j= col-1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i = row-1 , j = col+1; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
}
