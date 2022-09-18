package Challenges_Recursion_done;

public class TowerHanoi {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        int count = toh(2,"T1","T2","T3");
        System.out.println(count);
    }
    public static int toh(int n, String src, String dest,String helper){
        if(n==0){
            return 1;
        }
        int count = 0;
        count += toh(n-1,src,helper,dest);
        System.out.println("Move "+n+"th disc from "+src+" to "+dest);
        count += toh(n-1,helper,dest,src);
        return count;
    }
}
