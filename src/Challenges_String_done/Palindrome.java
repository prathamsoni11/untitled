package Challenges_String_done;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean res= palindrome1(str,0,str.length()-1);
        System.out.println(res);
    }
    public static boolean palindrome1(String str,int left , int right){
        if(str.length() == 1 || str.length() == 0){
            return true;
        }
        while(left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                return palindrome1(str, left + 1, right - 1);
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome2(String str){

        int n = str.length();
        for(int i =0;i< n/2;i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }

        return true;
    }
}
