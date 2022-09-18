package Backtracking;

public class CoinPermutation {
    public static void main(String[] args) {
        int[] array = {2,3,5,6};
        cp(array,10,"");
    }
    public static void cp(int[] denom , int amount , String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<denom.length ; i++){
            if(amount>=denom[i]) {
                cp(denom, amount - denom[i], ans + denom[i]);
            }
        }
    }
}
