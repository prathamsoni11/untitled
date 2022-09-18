package Challenges_Backtracking_done;

import java.util.Scanner;

public class Rate_in_maze {
    /*You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from position (i,j), down or right on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M). Find the rightmost path through which, rat can reach this position.
A path is rightmost, if the rat is at position (i,j), it will always move to (i,j+1), if there exists a path from (i,j+1) to (N,M).*/

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        /*char c=s.next().charAt(1);
        System.out.println(c);*/
        int m=s.nextInt();
        int n=s.nextInt();

        String[][] maze=new String[m][n];
        int[][] v=new int[m][n];
        int[][] sol=new int[m][n];
        for(int i=0;i<m;i++)
        {

            String str=s.next();
            for(int k=0;k<str.length();k++) {
                char cc=str.charAt(k);
                if(cc=='X') {
                    v[i][k]=1;
                }
            }

        }
        m--;
        n--;
        boolean ans =solveMaze(v,sol,0,0,m,n);
        if(ans==false){
            System.out.println("-1");
        }

        //5 4
        //OXOO
        //OOOX
        //OOXO
        //XOOO
        //XXOO

    }

    public static boolean solveMaze(int[][] v,int[][] sol,int i,int j,int m,int n) {
        if(i==m && j==n){

            sol[i][j] = 1;

            ///Print the soln
            for(int x=0;x<=m;x++){
                for(int y=0;y<=n;y++){
                    System.out.print(sol[x][y]+" ");
                }
                System.out.println();
            }
            return true;
        }
        if(v[i][j]==1)
            return false;
        v[i][j]=1;
        ///Recursive Case
        ///Assuming path exists from i,j
        sol[i][j] = 1;
        ///1. Go Right
        if(j+1<=n && v[i][j+1]==0){
            boolean pathMila = solveMaze(v,sol,i,j+1,m,n);
            if(pathMila==true){
                return true;
            }
        }
        /// 2. Go Down
        if(i+1<=m && v[i+1][j]==0){
            boolean pathMila = solveMaze(v,sol,i+1,j,m,n);
            if(pathMila==true){
                return true;
            }
        }

        /// Yahan aane se path nahin mila !
        ///Backtracking
        sol[i][j] = 0;
        return false;
    }
}
