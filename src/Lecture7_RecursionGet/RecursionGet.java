package Lecture7_RecursionGet;

import java.util.ArrayList;

public class RecursionGet {
    public static void main(String[] args) {

        System.out.println(getSS("abc"));
    }
    public static ArrayList<String> getSS(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList();
            baseResult.add("");
            return baseResult;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList();
        ArrayList<String> recResult = getSS(ros);
        for(int i = 0 ; i<recResult.size(); i++){
            myResult.add(recResult.get(i));
            myResult.add(cc + recResult.get(i));
        }
        return myResult;
    }
    public static ArrayList<String> getSSwASCII(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList();
            baseResult.add("");
            return baseResult;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSSwASCII(ros);
        for(int i = 0 ; i<recResult.size() ; i++){
            myResult.add(recResult.get(i));
            myResult.add(cc + recResult.get(i));
            myResult.add((int)cc+recResult.get(i));
        }
        return myResult;
    }
}
