package Challenges_Backtracking_done;

import java.util.Scanner;

public class Generate_Parentheses_Apple_Google_Facebook_Amazon_Netflix {
    /*Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.*/

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printParenthesis(2*n,"",0,n,0);

        //2
    }
    public static void printParenthesis(int n, String ans, int close, int limit, int open) {

        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if(close < open && open != 0) {
            printParenthesis(n - 1, ans + ")", close + 1, limit, open);
        }
        if (open < limit) {
            printParenthesis(n - 1, ans + "(", close, limit, open + 1);
        }
    }
}
