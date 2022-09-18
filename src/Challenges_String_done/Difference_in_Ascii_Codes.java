package Challenges_String_done;

import java.util.Scanner;

public class Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(diff_ascii(str));
    }
    public static String diff_ascii(String str){

        String ans = "";

        for(int i = 0;i < str.length() - 1;i++){

            ans += str.charAt(i);
            int diff = str.charAt(i + 1) - str.charAt(i);
            ans += diff;
            // ans += str.charAt(i + 1);
        }

        ans += str.charAt(str.length() - 1);

        return ans;
    }
}
