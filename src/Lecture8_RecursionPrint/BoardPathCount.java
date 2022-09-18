package Lecture8_RecursionPrint;

public class BoardPathCount {
    public static void main(String[] args) {
        int c = countBoardPath(0,10);
        System.out.println(c);
    }
    public static int countBoardPath(int cur , int end){
        if(cur == end){
            return 1;
        }
        if(cur>end){
            return 0;
        }
        int count = 0;
        for (int dice = 1 ; dice <= 6 ; dice++){
            count += countBoardPath(cur+dice,end);
        }
        return count;
    }
}
