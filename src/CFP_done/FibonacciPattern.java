package CFP_done;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0 , b = 1 ;
        int counter = 1;
        while (counter <= n){
            for (int i = 1 ; i <= counter ; i++) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println();

            counter++;
        }
    }
}
