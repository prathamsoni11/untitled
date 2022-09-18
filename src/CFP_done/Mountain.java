package CFP_done;

import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        int nsp = n+1;
        int row = 1;
        while(row<=n){
            for(int i = 1 ; i<= row ; i++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j = 1 ; j<=nsp ; j++){
                System.out.print(" "+"\t");
            }
            int k = 1;
            if(val == n+1){
                val--;
                k = 2;
            }
            for(; k<=row ; k++){
                val--;
                System.out.print(val+"\t");
            }
            System.out.println();
            val = 1;
            nsp -= 2;
            row++;
        }
    }
}
