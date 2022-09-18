package Challenges_Recursion_done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Recursion_all_subsequence {
    /*Print all the subsequences of a string in lexicographical order.*/

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            ArrayList<String> res = allSub(s);
            for(String val:res){
                System.out.println(val);
            }
        }

        //1
        //ab
    }
    public static ArrayList<String> allSub(String str){

        ArrayList<String> rr = subseq(str);

        Collections.sort(rr);
        return rr;

    }

    public static ArrayList<String> subseq(String str) {

        if (str.length() == 0) {

            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rr1 = subseq(str.substring(1));

        char ch = str.charAt(0);
        for (String val : rr1) {
            mr.add(val);
            mr.add(ch + val);
        }

        return mr;
    }
}
