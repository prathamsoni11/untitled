package Challenges_String_done;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compress(str));
    }
    public static String compress(String str){
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i <= str.length() - 1;i++){
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                cnt++;
            }else{
                sb.append(str.charAt(i));
                if(cnt + 1 > 1){
                    sb.append(cnt+1);
                }
                cnt = 0;
            }
        }

        return sb.toString();
    }

}
