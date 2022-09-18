package Challenges_Recursion_done;

import java.util.Scanner;

public class Recursion_Duplicate_Character_formatting {
    /*
    Take as input str, a string.
    Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’.
    E.g. for “hello” return “hel*lo”. Print the value returned
    */
    static String duplicateChar(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String ros = duplicateChar(s.substring(1));

        if (s.charAt(0) == ros.charAt(0)) {
            return s.charAt(0) + "*" + ros;
        }

        return s.charAt(0) + ros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(duplicateChar(s));
    }
}
