package Challenges_Recursion_done;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion_Dictionary_Order_Smaller {
    //Take as input str, a string.
    // Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string.
    // The output strings must be lexicographically sorted.

    public static void printPermutation(String ques, String ans, String orig) {
        // Base Case
        if (ques.length() == 0) {
            // If the ans is Lexicographically Smaller then print
            if (ans.compareTo(orig) < 0) {
                System.out.println(ans + " ");
            }
            return;
        }
        // Same code as that of print Permutations
        int cnt = 0;
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);
            printPermutation(roq, ans + ch, orig);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next();
        char[] temp = orig.toCharArray();
        Arrays.sort(temp);
        String ques = new String(temp);
        printPermutation(ques, "", orig);

        // cab
    }
}
