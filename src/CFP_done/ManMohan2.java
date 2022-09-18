package CFP_done;

import java.util.Scanner;

public class ManMohan2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        int row = 1;
        while(row<=n){
            for(int i = 1 ; i<=row ; i++){
                if(i == 1 || i == row){
                    System.out.print(val);
                }
                else{
                    System.out.print(0);
                }
            }
            if(row>1){
                val++;
            }
            System.out.println();
            row++;
        }
    }
}
