package Lecture8_RecursionPrint;

public class SSPrint {
    public static void main(String[] args) {
        printSSWAscii("ab","");
    }
    public static void printSS(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,result);
        printSS(ros,result+cc);
    }
    public static void printSSWAscii(String str,String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSSWAscii(ros,result);
        printSSWAscii(ros,result+cc);
        printSSWAscii(ros,result+(int)cc);
    }
}
