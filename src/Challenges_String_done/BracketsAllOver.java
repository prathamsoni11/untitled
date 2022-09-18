package Challenges_String_done;

import java.util.Arrays;
import java.util.Scanner;

public class BracketsAllOver {
    static final long MOD = 1000000007;

    static int n, m;
    static long[][][] dp;

    static int openingBrackets = 0, closeBrackets = 0;
    static int length = 0;

    static long solve(int pos, int open, int close) {
        if (pos == length) {
            if (close > 0 && open == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (dp[pos][open][close] != -1) {
            return dp[pos][open][close];
        }

        long ans = 0;
        if (close == 0) {
            if (open >= openingBrackets)
                ans = (ans + solve(pos + 1, open - openingBrackets + closeBrackets, 1)) % MOD;
        }

        ans = (ans + solve(pos + 1, open + 1, close)) % MOD;

        if (open > 0)
            ans = (ans + solve(pos + 1, open - 1, close)) % MOD;

        dp[pos][open][close] = ans;

        return ans;
    }

    public static void main(String[] args) {
        dp = new long[1000][1000][2];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        length = n - m + 1;
        String s = sc.next();
        if (n % 2 == 1) {
            //If n is odd, string can never be balanced
            System.out.println(0);
            return;
        }

        closeBrackets = 0;
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) == '(') {
                //We need a closing bracket to balance this opening bracket
                closeBrackets++;
            } else {
                //Encountered a ) , reduce a the no of closing brackets required
                closeBrackets--;
            }
            if (closeBrackets < 0) {
                //More closing brackets than opening brackets , increase the no of opening brackets for string A
                openingBrackets++;
                closeBrackets = 0;
            }
        }

        for (long[][] longs : dp) {
            for (long[] aLong : longs) {
                Arrays.fill(aLong, -1);
            }
        }

        System.out.println(solve(0, 0, 0));
    }
}
