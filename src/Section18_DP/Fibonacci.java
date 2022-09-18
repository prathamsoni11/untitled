package Section18_DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(FibTopDown(n,new int[n+1]));
        System.out.println(FibBottomUp(n));
        System.out.println(FibBUSpaceEfficient(n));
    }

    // Time complexity: 2^n  Space complexity: Recursion Extra space
    public static int FibRecursion(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fnm1 = FibRecursion(n-1);
        int fnm2 = FibRecursion(n-2);
        int fn = fnm1+fnm2;

        return fn;
    }

    // Time complexity: n  Space complexity: n + Recursion Extra space
    public static int FibTopDown(int n , int[] strg){
        if (n == 0 || n == 1){
            return n;
        }
        if (strg[n] != 0){
            return strg[n];
        }
        int fnm1 = FibTopDown(n-1 , strg);
        int fnm2 = FibTopDown(n-2 , strg);
        int fn = fnm1+fnm2;

        strg[n] = fn;

        return fn;
    }

    // Time complexity: n  Space complexity: n
    public static int FibBottomUp(int n){
        int[] strg = new int[n+1];

        // base case values fill
        strg[0] = 0;
        strg[1] = 1;

        for (int i = 2 ; i <= n ; i++){
            strg[i] = strg[i-1] + strg[i-2];
        }

        return strg[n];
    }

    //TC: n  SC: O(1)
    public static int FibBUSpaceEfficient(int n){
        int[] strg = new int[2];
        strg[0] = 0;
        strg[1] = 1;

        for (int slide = 1 ; slide <= n-1 ; slide++){
            int sum = strg[0] + strg[1];
            strg[0] = strg[1];
            strg[1] = sum;
        }
        return strg[1];
    }
}
