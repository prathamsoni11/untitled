package Challenges_Array_done;

import java.util.Scanner;

public class PrimeVisits {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        primeVisit();
    }
    public static void primeVisit() {


        int t = scn.nextInt();
        while (t-- > 0) {
            int a = scn.nextInt(), b = scn.nextInt();

            int[] primes = new int[b + 1];
            primes[0] = 0;
            primes[1] = 0;

            for (int i = 2; i <= b; i++) {
                if ((i & 1) == 0 || i < a) {
                    primes[i] = 0;
                } else {
                    primes[i] = 1;
                }
            }
            if (2 >= a) {
                primes[2] = 1;
            }
            for (int i = 3; i <= b; i += 2) {

                int j = 2;
                while (i * j <= b) {
                    primes[i * j] = 0;
                    j++;
                }
            }

            int count = 0;
            for (int i = 0; i <= b; i++) {
                if (primes[i] == 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return false;
        if (num == 2)
            return true;
        if ((num & 1) == 0)
            return false;

        boolean isPrime = true;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
