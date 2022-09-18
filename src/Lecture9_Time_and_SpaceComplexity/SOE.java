package Lecture9_Time_and_SpaceComplexity;

import java.util.Arrays;

public class SOE {
    public static void main(String[] args) {
        soe(25);
    }
    public static void soe(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;
        for(int table = 2 ; table*table <=n ; table++){
            if(prime[table] == false){
                continue;
            }
            for(int multi = 2 ; table*multi <= n ; multi++){
                prime[table*multi] = false;
            }
        }
        for(int i = 0 ; i < prime.length ; i++){
            if(prime[i]){
                System.out.println(i);
            }
        }
    }
}
