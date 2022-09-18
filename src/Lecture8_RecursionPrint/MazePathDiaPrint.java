package Lecture8_RecursionPrint;

public class MazePathDiaPrint {
    public static void main(String[] args) {
        printDiaMazePath(0,0,2,2,"");
    }
    public static void printDiaMazePath(int cr,int cc,int er,int ec,String ans){
        if(cr == er && cc == ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec){
            return;
        }
        printDiaMazePath(cr,cc+1,er,ec,ans+"H");
        printDiaMazePath(cr+1,cc,er,ec,ans+"V");
        printDiaMazePath(cr+1,cc+1,er,ec,ans+"D");
    }
}
