package Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class printMax {
    public static void printMax(int[] arr , int k ){
        Deque<Integer> q = new LinkedList<>();
        int i;
        for(i = 0 ; i< k ; i++){
            while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for (;i< arr.length ; i++){
            System.out.print(arr[q.getFirst()] + " ");
            while(!q.isEmpty() && q.getFirst() <= i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && arr[i]>arr[q.getLast()]){
                q.removeLast();
            }

            q.addLast(i);
        }
        System.out.println(arr[q.getFirst()]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,3,2,1,4,5,2,3,6};
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0 ; i < arr.length ; i++){
//            arr[i] = s.nextInt();
//        }
//        int k = s.nextInt();
        int k = 3;
        printMax(arr,k);
    }
}
