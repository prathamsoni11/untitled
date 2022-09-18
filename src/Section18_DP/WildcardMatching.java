package Section18_DP;

public class WildcardMatching {
    public static void main(String[] args) {
        String src = "abcdef";
        String pat = "a?*****";
        System.out.println(WMRecursion(src,pat));
        System.out.println(WMRecursion(src,pat,0,0));
        System.out.println(WMTD(src,pat,0,0,new int[src.length()][pat.length()]));
    }

    public static boolean WMRecursion(String src, String pat){
        if (src.length() == 0 && pat.length() == 0){
            return true;
        }
        if (src.length() != 0 && pat.length() == 0){
            return false;
        }
        if (src.length() == 0 && pat.length() != 0){
            for (int i = 0 ; i < pat.length() ; i++){
                if (pat.charAt(i) != '*'){
                    return false;
                }
            }
            return true;
        }
        char chs = src.charAt(0);
        char chp= pat.charAt(0);

        String ros = src.substring(1);
        String rop = pat.substring(1);
        boolean ans;
        if (chp == chs || chp == '?'){
            ans = WMRecursion(ros,rop);
        }else if (chp == '*'){
            boolean blank = WMRecursion(src,rop);
            boolean multiple = WMRecursion(ros,pat);

            ans = blank || multiple;
        }else {
            ans  = false;
        }

        return ans;
    }

    public static boolean WMRecursion(String src, String pat, int svidx, int pvidx){
        if (src.length() == svidx && pat.length() == pvidx){
            return true;
        }
        if (src.length() != svidx && pat.length() == pvidx){
            return false;
        }
        if (src.length() == svidx && pat.length() != pvidx){
            for (int i = pvidx ; i < pat.length() ; i++){
                if (pat.charAt(i) != '*'){
                    return false;
                }
            }
            return true;
        }
        char chs = src.charAt(svidx);
        char chp= pat.charAt(pvidx);

        boolean ans;
        if (chp == chs || chp == '?'){
            ans = WMRecursion(src,pat,svidx+1,pvidx+1);
        }else if (chp == '*'){
            boolean blank = WMRecursion(src,pat,svidx,pvidx+1);
            boolean multiple = WMRecursion(src,pat,svidx+1,pvidx);

            ans = blank || multiple;
        }else {
            ans  = false;
        }

        return ans;
    }

    public static boolean WMTD(String src, String pat, int svidx, int pvidx, int[][] strg){
        if (src.length() == svidx && pat.length() == pvidx){
            return true;
        }
        if (src.length() != svidx && pat.length() == pvidx){
            return false;
        }
        if (src.length() == svidx && pat.length() != pvidx){
            for (int i = pvidx ; i < pat.length() ; i++){
                if (pat.charAt(i) != '*'){
                    return false;
                }
            }
            return true;
        }
        if (strg[svidx][pvidx] != 0){
            return strg[svidx][pvidx] == 2 ? true : false;
        }
        char chs = src.charAt(svidx);
        char chp= pat.charAt(pvidx);

        boolean ans;
        if (chp == chs || chp == '?'){
            ans = WMTD(src,pat,svidx+1,pvidx+1,strg);
        }else if (chp == '*'){
            boolean blank = WMTD(src,pat,svidx,pvidx+1,strg);
            boolean multiple = WMTD(src,pat,svidx+1,pvidx,strg);

            ans = blank || multiple;
        }else {
            ans  = false;
        }
        strg[svidx][pvidx] = (ans == true ? 2 : 1);
        return ans;
    }

    public static boolean WMBU(String src, String pat){
        boolean[][] strg = new boolean[src.length()+1][pat.length()+1];

        strg[src.length()][pat.length()] = true;
        for (int row = src.length() ; row >= 0 ; row--){
            for (int col = pat.length()-1 ; col >= 0 ; col--){
                if (row == src.length()){
                    if (pat.charAt(col) == '*') {
                        strg[row][col] = strg[row][col + 1];
                    }else {
                        strg[row][col] = false;
                    }
                    continue;
                }

                char chs = src.charAt(row);
                char chp= pat.charAt(col);

                boolean ans;
                if (chp == chs || chp == '?'){
                    ans = strg[row+1][col+1];
                }else if (chp == '*'){
                    boolean blank = strg[row][col+1];
                    boolean multiple = strg[row+1][col];

                    ans = blank || multiple;
                }else {
                    ans  = false;
                }
                strg[row][col] = ans;
            }
        }
        return strg[0][0];
    }
}
