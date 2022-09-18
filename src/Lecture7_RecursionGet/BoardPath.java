package Lecture7_RecursionGet;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args) {

        System.out.println(getBoardPath(0,10).size());
    }
    public static ArrayList<String> getBoardPath(int cur , int end){
        if(cur == end){
            ArrayList br = new ArrayList();
            br.add("\n");
            return br;
        }
        if(cur>end){
            ArrayList br = new ArrayList();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        for(int dice = 1 ; dice<=6 ; dice++){
            ArrayList<String> rr = getBoardPath(cur+dice , end );
            for(String rrs : rr){
                mr.add(dice+rrs);
            }
        }
        return mr;
    }
}
