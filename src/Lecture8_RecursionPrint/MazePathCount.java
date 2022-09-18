package Lecture8_RecursionPrint;

public class MazePathCount {
    public static void main(String[] args) {
        int c = countMazePath(0,0,2,2);
        System.out.println(c);
    }
    public static int countMazePath(int cr,int cc,int er,int ec){
        if(cr == er && cc == ec){
            return 1;
        }
        if(cr>er || cc>ec){
            return 0;
        }
        int ch = countMazePath(cr,cc+1,er,ec);
        int cv = countMazePath(cr+1,cc,er,ec);
        return ch+cv;
    }
}
