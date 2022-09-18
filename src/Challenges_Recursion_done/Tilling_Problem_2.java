package Challenges_Recursion_done;

import java.util.Scanner;

public class Tilling_Problem_2 {
    //Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m .
    // A tile can either be placed horizontally or vertically.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 1 ; i <= T ; i++){
            int n = scn.nextInt();
            int m = scn.nextInt();
            System.out.println(countWays(1,n,m));
        }
    }
    public static int countWays(int lo,int n , int m){
        if(lo == n || n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int count = 0;
        if(lo<=n) {
            count += countWays(lo + 1, n, m);
            count += countWays(m,n-lo+1, m);
        }
        return count;
    }
}
