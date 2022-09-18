package Challenges_Array_done;

import java.util.Scanner;

public class WinningCBScholarship {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long m = scn.nextLong();
        long x = scn.nextLong();
        long y = scn.nextLong();
        long remstudents = 0;
        long leftcoupons = 0;
        long studentsgetingfull = m / x;
        if (n > studentsgetingfull) {
            remstudents = n - studentsgetingfull;
            leftcoupons = m % x;
        } else {
            System.out.println(n);
            return;
        }
        while (remstudents > 1) {
            leftcoupons += y;
            if (leftcoupons >= x) {
                long mediator = leftcoupons / x;
                if (mediator <= remstudents) {
                    studentsgetingfull += mediator;
                    remstudents -= mediator;
                    leftcoupons = leftcoupons % x;
                } else {
                    studentsgetingfull += remstudents - 1;
                    break;
                }
            }
            remstudents--;
        }
        System.out.println(studentsgetingfull);
    }
}
