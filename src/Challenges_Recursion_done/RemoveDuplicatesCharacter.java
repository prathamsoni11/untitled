package Challenges_Recursion_done;

import java.util.Scanner;

public class RemoveDuplicatesCharacter {
    //Take as input str, a string.
    // Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. E.g. for “hello” return “helo”.
    // Print the value returned.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        RemoveDupCh(str,"");
    }
    public static void RemoveDupCh(String ques, String ans) {

        if(ques.length() == 1) {
            System.out.println(ans+ques.charAt(0));
            return;
        }

        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        if(ch == ques.charAt(1)) {
            RemoveDupCh(ros, ans);
        }else {
            RemoveDupCh(ros, ans + ch);
        }
    }
}
