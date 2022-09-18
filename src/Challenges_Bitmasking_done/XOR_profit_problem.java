package Challenges_Bitmasking_done;

public class XOR_profit_problem {
    /*We are given two coins of value x and y.
    We have to find the maximum of value of a XOR b where x <= a <= b <= y.*/

    public static int profit(int x, int y) {

        int num = x ^ y;
        int msb = 0;
        while (num != 0) {
            num = num >> 1;
            msb++;
        }
        int result = 1;
        while (msb-- > 0) {
            result = result << 1;
        }
        return result - 1;
    }

    public static void main(String[] args) {

        //5
        //6

        //Explanation
        //
        //If a and b are taken to be 5. Then a xor b = 0
        //If a and b are taken to be 6. Then a xor b = 0
        //If a is 5 and b is 6. Then a xor b is 3.
    }
}
