package CFP_done;

import java.util.Scanner;

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1 ; i<=n ; i++){
            int car = scn.nextInt();
            int even = 0,odd = 0;
            while(car>0) {
                int r = car % 10;
                if (r % 2 == 0) {
                    even = even + r;
                } else {
                    odd = odd + r;
                }
                car = car/10;
            }
            if(odd%3 == 0 || even%4 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
