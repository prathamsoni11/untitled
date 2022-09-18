package Backtracking;

public class QueenCombination {
    public static void main(String[] args) {
//        qc(new boolean[4] , 0 , 2 ,"" , -1);
        QueenCombinationBoxRespect(new boolean[4] , 0 , 0 ,2 , "");
    }
    public static void qc(boolean[] boxes , int qpsf , int tq , String ans , int lastBoxUsed){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i = lastBoxUsed+1 ; i < boxes.length ; i++){
            boxes[i] = true;
            qc(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " " , i);
            boxes[i] = false;  //undo
        }
    }
    public static void QueenCombinationBoxRespect(boolean board[] , int col , int qpsf , int tq , String ans){
        //positive base case
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        //negative base case
        if(col == board.length){
            return;
        }
        // place
        board[col] = true;
        QueenCombinationBoxRespect(board,col+1,qpsf+1,tq,ans + "b" + col);
        board[col] = false;

        //not place
        QueenCombinationBoxRespect(board,col+1,qpsf,tq,ans);
    }
}
