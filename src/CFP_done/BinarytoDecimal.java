package CFP_done;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bin = scn.nextInt();
        int mul = 1;
        int rem = 0;
        int ans = 0;
        while(bin != 0){
            rem = bin%10;
            ans = ans + rem*mul;
            bin = bin/10;
            mul = mul * 2;
        }
        System.out.println(ans);
    }
}
