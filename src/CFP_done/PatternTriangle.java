package CFP_done;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int nsp=n-1;
        int num=1;

        for(int i=1;i<=n;i++)
        {
            //work for spaces
            for(int csp=1;csp<=nsp;csp++)
            {
                System.out.print(" \t");
            }

            // work for numbers

            for(int cst=1;cst<=(2*i-1);cst++)
            {
                System.out.print(num+"\t");

                if(cst<i)
                    num++;
                else
                    num--;

            }

            //preparation for next iteration

            nsp=nsp-1;
            num+=2;
            System.out.println();

        }
    }
}
