package Challenges_Recursion_done;

import java.util.Scanner;

public class Move_all_X_at_end {
    //Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end.
    //E.g. for “abexexdexed” return “abeedeedxxx”.
    //Print the value returned

    public static String move(String s) {
        if (s.length() <= 1)
            return s;

        String ros = s.substring(1);
        ros = move(ros);
        if (s.charAt(0) == 'x')
            return ros + s.charAt(0);
        else
            return s.charAt(0) + ros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(move(s));

        //axbxc
    }
}
