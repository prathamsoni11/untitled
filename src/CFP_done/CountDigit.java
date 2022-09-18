package CFP_done;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = scn.nextInt();
        int rem = 0;
        int cou = 0;
        while(n != 0){
            rem = n%10;
            n = n/10;
            if(rem == val ) cou++;
        }
        System.out.println(cou);
    }
}
