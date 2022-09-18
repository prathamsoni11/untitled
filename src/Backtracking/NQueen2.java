package Backtracking;

public class NQueen2 {
    static int count = 0;
    public static void main(String[] args) {
//        N2(new boolean[4][4],0,0,4,"");
//        K2(new boolean[4][4],0,0,3,"");
        K2Kill(new boolean[4][4],0,0,3,"");
    }
    public static void N2(boolean[][] board,int row,int qpsf,int tq,String ans){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        if(row == board.length){
            return;
        }
        for(int col = 0 ; col < board[0].length ; col++){
            board[row][col] = true;
            N2(board,row+1,qpsf+1,tq,ans+"{"+row+","+col+"}");
            board[row][col] = false;
        }
    }
    public static void K2(boolean[][] board,int row,int qpsf,int tq,String ans){
        if(qpsf == tq){
            System.out.println(++count + ans);
            return;
        }
        if(row == board.length){
            return;
        }

        // Place
        for(int col = 0 ; col < board[0].length ; col++){
            board[row][col] = true;
            K2(board,row+1,qpsf+1,tq,ans+"{"+row+","+col+"}");
            board[row][col] = false;
        }

        // Not Place
        K2(board,row+1,qpsf,tq,ans);
    }
    public static void K2Kill(boolean[][] board,int row,int qpsf,int tq,String ans){
        if(qpsf == tq){
            System.out.println(++count + ans);
            return;
        }
        if(row == board.length){
            return;
        }

        // Place
        for(int col = 0 ; col < board[0].length ; col++){
            if(isItSafeToPlaceTheQueen(board,row,col)) {
                board[row][col] = true;
                K2Kill(board, row + 1, qpsf + 1, tq, ans + "{" + row + "," + col + "}");
                board[row][col] = false;
            }
        }

        // Not Place
        K2Kill(board,row+1,qpsf,tq,ans);
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
