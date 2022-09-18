package Backtracking;

public class NKnight {
    static int count = 0;
    public static void main(String[] args) {
        NKnightKill(new boolean[3][3] , 0,0,0,3,"");
    }
    public static void NKnightKill(boolean[][] board ,int row, int col , int qpsf , int tq , String ans){
        //positive base case
        if(qpsf == tq){
            System.out.println(++count + ans);
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
            NKnightKill(board, row, col+1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
            board[row][col] = false;
        }
        //not place
        NKnightKill(board,row,col+1,qpsf,tq,ans);
    }
    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col){
        int[] rowArr = {-1,-2,-2,-1};
        int[] colArr = {2,1,-1,-2};
        for(int i = 0 ; i < 4 ; i++){

            int r = row + rowArr[i];
            int c = col + colArr[i];

            if(r>=0 && r < board.length && c>=0 && c < board[0].length){
                if(board[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
}
