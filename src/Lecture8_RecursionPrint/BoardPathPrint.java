package Lecture8_RecursionPrint;

public class BoardPathPrint {
    public static void main(String[] args) {
        printBoardPath(0,10,"");
    }
    public static void printBoardPath(int cur , int end , String ans){
        if(cur == end){
            System.out.println(ans);
            return;
        }
        if(cur>end){
            return;
        }
        for(int dice = 1 ; dice<=6 ; dice++){
            printBoardPath(cur+dice,end,ans+dice);
        }
    }
}
