package Challenges_Recursion_done;

import java.util.Scanner;

public class All_Indices_Problem {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = takeInput();
        int n = scn.nextInt();
        int[] indices = allIndices(array,0,n,0);
        display(indices);
    }
    public static int[] takeInput(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        return arr;
    }
    public static int[] allIndices(int[] arr,int si,int data,int count){
        if(si == arr.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si] == data){
            indices = allIndices(arr,si+1,data,count+1);
        }
        else{
            indices = allIndices(arr,si+1,data,count);
        }
        if(arr[si] == data){
            indices[count] = si;
        }
        return indices;
    }
    public static void display(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
