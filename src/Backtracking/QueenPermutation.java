package Backtracking;

public class QueenPermutation {
    public static void main(String[] args) {
        qp(new boolean[4] , 0 , 2 , "");
        
    }
    public static void qp(boolean[] boxes , int qpsf , int tq , String ans){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i < boxes.length ; i++){
            if(boxes[i] == false) {
                boxes[i] = true;
                qp(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
                boxes[i] = false;  //undo
            }
        }
    }
}
