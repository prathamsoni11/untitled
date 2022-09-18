package Challenges_String_done;

import java.util.Scanner;

public class PiyushMagicPark {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();

        int k = scn.nextInt();
        int s = scn.nextInt();

        char[][] arr = new char[n][m];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ; j++){
                arr[i][j] = scn.next().charAt(0);
            }
        }

        maze(arr,k,s);
    }
    public static void maze(char[][] arr, int k, int s) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                char ch = arr[i][j];

                if (s < k) {
                    flag = true;
                    break;
                }

                if (ch == '*') {
                    s += 5;
                } else if (ch == '.') {
                    s -= 2;
                } else {
                    break;
                }
                if (j != arr[i].length - 1) {
                    s--;
                }
            }
        }

        if (!flag) {
            System.out.println("Yes");
            System.out.println(s);
        } else {
            System.out.println("No");
        }

    }
}
