package Challenges_Recursion_done;

import java.util.Scanner;

public class Convert_StringToInteger {
    //Take as input str, a number in form of a string.
    // Write a recursive function to convert the number in string form to number in integer form.
    // E.g. for “1234” return 1234. Print the value returned.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        converter(str,0);
    }
    public static void converter(String str, int n){
        if (str.length() == 0){
            System.out.println(n);
            return;
        }
        int digit = str.charAt(0)-'0';
        String ros = str.substring(1);
        converter(ros,n*10+digit);
    }
}
