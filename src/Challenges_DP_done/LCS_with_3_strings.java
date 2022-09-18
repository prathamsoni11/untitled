package Challenges_DP_done;

public class LCS_with_3_strings {
    // Given 3 strings ,the task is to find the longest common sub-sequence in all three given sequences.

    public static int lcs(String str1, String str2, String str3) {
        int[][][] dp = new int[str1.length()+1][str2.length()+1][str3.length()+1];
        for(int i=1;i<=str1.length();i++) {
            for(int j=1;j<=str2.length();j++) {
                for(int k=1;k<=str3.length();k++) {
                    if(i==0 || j==0 || k==0)
                        dp[i][j][k]=0;
                    else if (str1.charAt(i-1)==str2.charAt(j-1) && str2.charAt(j-1)==str3.charAt(k-1))
                        dp[i][j][k]=1+dp[i-1][j-1][k-1];
                    else
                        dp[i][j][k]=Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k], dp[i][j][k-1]));
                }
            }
        }
        return dp[str1.length()][str2.length()][str3.length()];
    }

    public static void main(String[] args) {
        String str1 = "GHQWNV";
        String str2 = "SJNSDGH";
        String str3 = "CPGMAH";
        System.out.println(lcs(str1,str2,str3));
    }
}
