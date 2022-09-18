package Challenges_Recursion_done;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion_Dictionary_Order_Larger {
    //Take as input str, a string.
    // Write a recursive function which prints all the words possible by rearranging the characters of this string which are in dictionary order larger than the given string.

    //The output strings must be lexicographically sorted.
    public static void lexicoLarger(String str, String osf, boolean flag, String originalString) {
        if (str.length() == 0) {
            if (osf.compareTo(originalString) > 0)
                System.out.println(osf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(0, i) + str.substring(i + 1);
            char ch = str.charAt(i);
            if (flag) {
                lexicoLarger(ros, osf + ch, flag, originalString);
            } else {
                if (str.charAt(i) >= str.charAt(0)) {
                    lexicoLarger(ros, osf + ch, flag || ch > str.charAt(0), originalString);
                } else if (str.charAt(i) < str.charAt(0)) {
                    // No call
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String orig = new String(str);

        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);

        lexicoLarger(str, "", false, orig);

        //cab
        //The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" .
        // Only one of them is lexicographically greater than "cab". We only print "cba".
    }
}
