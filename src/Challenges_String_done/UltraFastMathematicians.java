package Challenges_String_done;

import java.util.Scanner;

public class UltraFastMathematicians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str1 = sc.next();
            String str2 = sc.next();
            StringBuilder sb = new StringBuilder("");
            int i;
            for(i = 0; i < str1.length() && i< str2.length(); i++ ){
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                if(c1 != c2) sb.append("1");
                else sb.append("0");
            }
            while(i < str1.length()){
                sb.append(str1.charAt(i));
                i++;
            }
            while(i < str2.length()){
                sb.append(str2.charAt(i));
                i++;
            }

            System.out.println(sb);


        }
    }
}
