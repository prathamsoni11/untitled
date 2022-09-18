package CFP_done;

import java.util.Scanner;

public class ReverseQuadraticEquation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        printRoots(a,b,c);
    }
    public static void printRoots(int a, int b, int c){


        int d = (b * b) - (4 * a * c);

        int root1 = 0;
        int root2 = 0;

        if(d < 0){
            System.out.println("Imaginary");
            return;
        }

        if(d == 0){

            System.out.println("Real and Equal");
        }else if(d >0){
            System.out.println("Real and Distinct");
        }

        root1 = (int) ((- b - Math.sqrt(d)) / (2 * a));
        root2 = (int) ((- b + Math.sqrt(d)) / (2 * a));

        System.out.println(root1 +" "+root2);

    }
}
