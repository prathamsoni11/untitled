package Lecture7_RecursionGet;

import java.util.ArrayList;

public class MazePathDiagonal {
    public static void main(String[] args) {
        System.out.println(getMazePathDiagonal(0,0,2,2));
    }
    public static ArrayList<String> getMazePathDiagonal(int cr , int cc , int er , int ec) {
        if (cr == er && cc == ec) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getMazePathDiagonal(cr, cc + 1, er, ec);
        for (String rrhs : rrh) {
            mr.add("H" + rrhs);
        }
        ArrayList<String> rrv = getMazePathDiagonal(cr + 1, cc, er, ec);
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        ArrayList<String> rrd = getMazePathDiagonal(cr + 1, cc+1, er, ec);
        for (String rrds : rrd) {
            mr.add("D" + rrds);
        }
        return mr;
    }
}
