package Backtracking;

public class CoinCombination {
    public static void main(String[] args) {
        int[] array = {2,3,5,6};
//        cc(array,10,"",0);
        ccCoinRespect(new int[] {2,3,5,6},0,10,"");
    }
    public static void cc(int[] denom , int amount , String ans , int lastDenoIndex){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i = lastDenoIndex ; i<denom.length ; i++){
            if(amount>=denom[i]) {
                cc(denom, amount - denom[i], ans + denom[i], i);
            }
        }
    }
    public static void ccCoinRespect(int[] denom , int vidx ,int amount, String ans){
        // positive bc
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        // negative bc
        if(amount<0 || vidx == denom.length){
            return;
        }
        //yes
        ccCoinRespect(denom,vidx,amount-denom[vidx],ans+denom[vidx]);
        //no
        ccCoinRespect(denom,vidx+1,amount,ans);
    }
}
