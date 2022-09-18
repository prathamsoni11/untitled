package CFP_done;

import java.util.Scanner;

public class PatternZero {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        int row = 1;
        while(row<=n){
            for(int i = 1 ; i <= row ; i++){
                if(i == 1 || i == row){
                    System.out.print(val+"\t");
                }
                else if(row >= 3){
                    System.out.print(0+"\t");
                }
            }
            System.out.println();
            val = val+1;
            row++;
        }
    }
}
