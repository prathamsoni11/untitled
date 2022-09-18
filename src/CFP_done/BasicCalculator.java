package CFP_done;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch;
        int res = 0;
        do {
            ch = scn.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                int a = scn.nextInt();
                int b = scn.nextInt();
                if (ch == '+') res = a + b;
                else if (ch == '-') res = a - b;
                else if (ch == '*') res = a * b;
                else if (ch == '/') res = a / b;
                else if (ch == '%') res = a % b;
                System.out.println(res);
            }
            else {
                if (ch != 'X' && ch != 'x') {
                    System.out.println("Invalid operation. Try again.");
                }
            }
        }while (ch != 'X' && ch != 'x') ;
    }
}
