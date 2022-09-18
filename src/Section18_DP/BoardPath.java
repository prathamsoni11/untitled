package Section18_DP;

public class BoardPath {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(BPRecursion(0,n));
        System.out.println(BPTD(0,n,new int[n]));
        System.out.println(BPBU(n));
        System.out.println(BPBUSE(n));
    }
    public static int BPRecursion(int cur , int end){
        if(cur == end){
            return 1;
        }
        if(cur>end){
            return 0;
        }
        int count = 0;
        for (int dice = 1 ; dice <= 6 ; dice++){
            count += BPRecursion(cur+dice,end);
        }
        return count;
    }
    public static int BPTD(int cur , int end , int[] strg){
        if(cur == end){
            return 1;
        }
        if(cur>end){
            return 0;
        }
        if (strg[cur] != 0){   // re-use
            return strg[cur];
        }
        int count = 0;
        for (int dice = 1 ; dice <= 6 ; dice++){
            count += BPTD(cur+dice,end,strg);
        }
        strg[cur] = count;   //store
        return count;
    }

    public static int BPBU(int end){
        int[] strg = new int[end+6];
        strg[end] = 1;
        for (int i = end-1 ; i>=0 ; i--){
            strg[i] = strg[i+1] + strg[i+2] + strg[i+3] + strg[i+4] + strg[i+5] + strg[i+6];
        }
        return strg[0];
    }

    public static int BPBUSE(int end){
        int[] strg = new int[6];
        strg[0] = 1;
        for (int slide = 1 ; slide <= end ; slide++){
            int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
            strg[5] = strg[4];
            strg[4] = strg[3];
            strg[3] = strg[2];
            strg[2] = strg[1];
            strg[1] = strg[0];
            strg[0] = sum;
        }
        return strg[0];
    }
}
