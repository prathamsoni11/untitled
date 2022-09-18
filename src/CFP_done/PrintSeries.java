package CFP_done;

import java.util.Scanner;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N1 = scn.nextInt();
        int N2 = scn.nextInt();
        for(int i = 1 ; i<=N1 ; i++){
            int ans = 3*i + 2;
            if(ans%N2 != 0){
                System.out.println(ans);
            }else{
                N1 += 1;
            }
        }
    }
}
