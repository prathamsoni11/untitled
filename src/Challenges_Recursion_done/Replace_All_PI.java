package Challenges_Recursion_done;

import java.util.Scanner;

public class Replace_All_PI {
    //Replace all occurrences of pi with 3.14
    static String replacePi(String s) {
        if (s.length() <= 1) {
            return s;
        }

        if (s.substring(0, 2).equals("pi")) {
            String ros = replacePi(s.substring(2));
            return "3.14" + ros;
        }

        String ros = replacePi(s.substring(1));
        return s.charAt(0) + ros;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            String s = sc.next();

            System.out.println(replacePi(s));
        }

        //3
        //xpix
        //xabpixx3.15x
        //xpipippixx
    }
}
