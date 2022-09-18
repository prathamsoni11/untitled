package CFP_done;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;

        while(sum >= 0){

            int n = scn.nextInt();
            sum += n;

            if(sum < 0) break;
            System.out.println(n);
        }
    }
}
