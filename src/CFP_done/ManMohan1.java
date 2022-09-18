package CFP_done;

import java.util.Scanner;

public class ManMohan1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        while(row<=n){
            if(row%2 == 1){
                for(int i = 1 ; i <=row ; i++){
                    System.out.print(1);
                }
            }
            else{
                for(int i = 1 ; i<=row ; i++){
                    if(i == 1 || i == row){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
            row++;
        }
    }
}
