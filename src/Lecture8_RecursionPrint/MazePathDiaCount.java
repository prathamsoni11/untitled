package Lecture8_RecursionPrint;

public class MazePathDiaCount {
    public static void main(String[] args) {
        int c = countDiaMazePath(0,0,2,2);
        System.out.println(c);
    }
    public static int countDiaMazePath(int cr,int cc,int er,int ec){
        if(cr == er && cc == ec){
            return 1;
        }
        if(cr>er || cc>ec){
            return 0 ;
        }
        int ch = countDiaMazePath(cr,cc+1,er,ec);
        int cv = countDiaMazePath(cr+1,cc,er,ec);
        int cd = countDiaMazePath(cr+1,cc+1,er,ec);
        return ch+cv+cd;
    }
}
