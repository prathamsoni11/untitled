package Challenges_DP_done;

import java.util.Scanner;

public class wildcard_pattern_matching {
    /*
Given a text 'str' and a wildcard pattern 'pattern', The wildcard pattern can include the characters ‘?’ and ‘ * ’.
‘?’ – matches any single character
‘*’ – Matches any sequence of characters (including the empty sequence)
Find out if the given text matches the pattern.

Input Format:-
Each testcase contains two strings. First line contains the text string and the second line contains the pattern.
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.next();
        b = sc.next();

        if (a.equals(b)) {
            System.out.println(1);
            return;
        }

        StringBuilder tmp = new StringBuilder(b);

        //Remove consecutive * from the pattern string
        for (int i = 0; i + 1 < tmp.length(); i++) {
            if (tmp.charAt(i) == '*' && tmp.charAt(i + 1) == '*') {
                tmp.deleteCharAt(i);
                i--;
            }
        }

        b = tmp.toString();

        int ans = wildcard(a, b) ? 1 : 0;
        System.out.println(ans);

        // aa
        //a*a
    }

    static boolean wildcard(String text, String pattern) {
        int r = text.length();
        int c = pattern.length();

        boolean[][] dp = new boolean[r + 1][c + 1];

        for (int i = 0; i <= r; i++) {
            dp[i][0] = false;
        }

        for (int j = 0; j <= c; j++) {
            dp[0][j] = false;
        }

        dp[0][0] = true; //Base case - Strings of 0 length always match

        //If first character of pattern is * then mark (0,1) as true since * can be mapped with empty sequence as well
        if (pattern.charAt(0) == '*') {
            dp[0][1] = true;
        }
        for (int i = 0; i < pattern.length() && pattern.charAt(i) == '*'; i++) {
            dp[i][1] = true;
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    //If current character of each string matches then mark this as however its previous state was
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '?') {
                    //Since ? can be mapped with all characters , do the same for this as well
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    //Since * can be mapped with all strings , mark current state as OR of both previous states
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    //Since no matching took place , mark this cell as false
                    dp[i][j] = false;
                }
            }
        }



        return dp[r][c];
    }
}
