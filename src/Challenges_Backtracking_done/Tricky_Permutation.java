package Challenges_Backtracking_done;

import java.util.Arrays;
import java.util.Scanner;

public class Tricky_Permutation {
    /*Given a string containing duplicates, print all its distinct permutations such
    that there are no duplicate permutations and all permutations are printed in a lexicographic order.*/
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        char[] charray = str.toCharArray();
        Arrays.sort(charray);

        permutationNoDuplicates(new String(charray), "");

        //ABA
    }

    public static void permutationNoDuplicates(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {

            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);

            boolean flag = true;

            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = false;
                }
            }

            if (flag)
                permutationNoDuplicates(roq, ans + ch);
        }

    }
}
