package CFP_done;
import java.util.Scanner;

public class DoubleSideArrow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsv = 1;
        int nsp1 = n-1;
        int nsp2 = -1;
        int val1 = 1;
        int val2 = 1;
        int row = 1;
        while(row<=n){
            int csp1 = 1;
            while(csp1<=nsp1){
                System.out.print(" ");
                csp1++;
            }
            int csv1 = 1;
            while(csv1<=nsv){
                System.out.print(val1);
                val1 = val1 - 1;
                csv1++;
            }
            int csp2 = 1;
            while(csp2<=nsp2){
                System.out.print(" ");
                csp2++;
            }
            if(row != 1 && row != n ){
                int csv2 = 1;
                while(csv2<=nsv){
                    System.out.print(val2);
                    val2 = val2 + 1;
                    csv2++;
                }
            }
            System.out.println();
            if(row<=n/2){
                nsv += 1;
                nsp1 -= 2;
                val1 = row + 1;
                nsp2 += 2;
                val2 = 1;
            }
            else{
                nsv -=1;
                nsp1 += 2;
                val1 = n-row;
                nsp2 -= 2;
                val2 = 1;
            }
            row++;
        }
    }
}
