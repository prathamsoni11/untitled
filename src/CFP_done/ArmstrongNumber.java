package CFP_done;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = numberOfDigits(n);
        System.out.println(isArmstrong(n,ans));
    }
    public static void printAllArmstrongs(int ll,int ul){

        for(int i=ll;i<=ul;i++) {

            int digits=numberOfDigits(i);
            boolean ans=isArmstrong(i,digits);
            if(ans)
                System.out.println(i);
        }
    }

    public static boolean isArmstrong(int num,int nod){

        int sum=0;

        int temp=num;

        while(num!=0){

            int rem=num%10;

            int p=1;
            for(int i=1;i<=nod;i++)
                p=p*rem;
            sum+=p;

            num/=10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }

    public static int numberOfDigits(int num){

        int count=0;
        while(num!=0){
            num=num/10;
            count++;

        }
        return count;
    }
}
