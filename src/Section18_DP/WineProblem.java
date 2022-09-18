package Section18_DP;

public class WineProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4};
        System.out.println(WPRecursion(arr,0, arr.length-1, 1));
        System.out.println(WPRecursion(arr,0, arr.length-1));
        int[] arr1 = new int[1000];
        for (int i = 0 ; i < arr1.length ; i++){
            arr1[i] = i;
        }
        System.out.println(WPTD(arr1,0,arr1.length-1,new int[arr1.length][arr1.length]));
        System.out.println(WPBU(arr1));
    }
    public static int WPRecursion(int[] arr , int si , int ei , int yr){
        if (si == ei){
            return arr[si]*yr;
        }

        int start = WPRecursion(arr, si+1, ei, yr+1) + arr[si]*yr;
        int end = WPRecursion(arr, si, ei-1, yr+1) + arr[ei]*yr;

        int ans = Math.max(start,end);
        return ans;
    }

    public static int WPRecursion(int[] arr , int si , int ei ){
        int yr = arr.length-(ei-si+1)+1;
        if (si == ei){
            return arr[si]*yr;
        }

        int start = WPRecursion(arr, si+1, ei) + arr[si]*yr;
        int end = WPRecursion(arr, si, ei-1) + arr[ei]*yr;

        int ans = Math.max(start,end);
        return ans;
    }

    public static int WPTD(int[] arr , int si , int ei , int[][] strg ){
        int yr = arr.length-(ei-si+1)+1;
        if (si == ei){
            return arr[si]*yr;
        }
        if (strg[si][ei] != 0){
            return strg[si][ei];
        }

        int start = WPTD(arr, si+1, ei , strg) + arr[si]*yr;
        int end = WPTD(arr, si, ei-1 , strg) + arr[ei]*yr;

        int ans = Math.max(start,end);

        strg[si][ei] = ans;
        return ans;
    }

    public static int WPBU(int[] arr){
        int n = arr.length;
        int[][] strg = new int[n][n];

        for (int slide = 0 ; slide <= n-1 ; slide++){
            for (int si = 0 ; si <= n-slide-1 ; si++){
                int ei = si+slide;
                int yr = arr.length-(ei-si+1)+1;
                if (si == ei){
                    strg[si][ei] = arr[si]*yr;
                }else {
                    int start = strg[si+1][ei] + arr[si] * yr;
                    int end = strg[si][ei-1] + arr[ei] * yr;

                    int ans = Math.max(start, end);

                    strg[si][ei] = ans;
                }
            }
        }

        return strg[0][n-1];
    }
}
