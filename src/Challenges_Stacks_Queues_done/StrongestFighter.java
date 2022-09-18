package Challenges_Stacks_Queues_done;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StrongestFighter {
    /*There is a group of MMA fighters standing together in a line.
    Given the value of their strengths, find the strength of the strongest fighter in continuous sub-groups of size k.

Input Format
First line contains an integer N, the number of fighters Followed by N integers where i'th integer denotes the strength of i'th fighter.
Next line contains the size of sub-group k */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        StrongestFighter(arr,n,k);

        //5
        //1 3 1 4 5
        //3
    }
    static void StrongestFighter(int arr[], int n, int k) {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();

        /* Process first k (or first window) elements of array */
        int i;
        for (i = 0; i < k; ++i) {
            // For every element, the previous smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast(); // Remove from rear

            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (; i < n; ++i) {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                Qi.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
}
