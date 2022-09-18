package CFP_done;

import java.util.Scanner;

public class IncreaseDecreaseSequence {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(valid_invalid(5));
    }
    public static boolean valid_invalid(int n){

        int prev = scn.nextInt();
        int cnt = 1;
        boolean goingUp = false;
        boolean isValid = true;

        while(cnt < n){

            int curr = scn.nextInt();

            int diff = curr - prev;
            // As the sequence must be strctly decreasing or increasing
            if(diff == 0){
                isValid = false;
            }else if(diff > 0){  // If Sequence is increasing
                goingUp = true;
            }else if(goingUp && diff < 0){
                // If Sequence is Decreasing if its already increased once
                isValid = false;
            }

            prev = curr;
            cnt++;

        }

        return isValid;
    }

}
