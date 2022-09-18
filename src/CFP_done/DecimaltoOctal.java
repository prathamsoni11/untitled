package CFP_done;

import java.util.Scanner;

public class DecimaltoOctal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int dec = scn.nextInt();
        int mul = 1;
        int rem = 0;
        int ans = 0;
        while(dec != 0){
            rem = dec%8;
            ans = ans + rem*mul;
            dec = dec/8;
            mul = mul * 10;
        }
        System.out.println(ans);
    }
}
