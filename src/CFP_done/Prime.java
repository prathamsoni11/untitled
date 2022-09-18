package CFP_done;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean a  = true;
        for(int i = 2 ; i<=n-1 ; i++){
            if(n%i == 0){
                a  = false;
            }
        }
        if(a == true) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
