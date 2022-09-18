package Lecture9_Time_and_SpaceComplexity;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int pnb = power(x,n/2);
        if(n%2 == 1){
            return pnb*pnb*x;
        }
        else{
            return pnb*pnb;
        }
    }
}
