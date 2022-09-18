package Challenges_Array_done;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for (int j = 0 ; j < n1 ; j++){
            one[j] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for (int j = 0 ; j < n2 ; j++){
            two[j] = scn.nextInt();
        }
        arraySum(one,two);
    }
    public static void arraySum(int[] one, int[] two) {

        ArrayList ans = new ArrayList<>();

        int i = one.length - 1;
        int j = two.length - 1;

        int carry = 0;
        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0) {
                sum += one[i];
            }

            if (j >= 0) {
                sum += two[j];
            }

            int rem = sum % 10;
            ans.add(0, rem);
            carry = sum / 10;

            i--;
            j--;
        }

        if (carry != 0) {
            ans.add(0, carry);
        }

        for (i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + ", ");
        }
        System.out.println("END");
    }
}
