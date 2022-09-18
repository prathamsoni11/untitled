package Challenges_Heaps_done;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hostel_Visit {
    /*Dean of MAIT is going to visit Hostels of MAIT.
     As you know that he is a very busy person so he decided to visit only first "K" nearest Hostels.
     Hostels are situated in 2D plane.
     You are given the coordinates of hostels and you have to answer the Rocket distance of Kth nearest hostel from origin ( Dean's place ) .
    */

    /*Input Format

First line of input contains Q Total no. of queries and K There are two types of queries:

first type : 1 x y For query of 1st type, you came to know about the co-ordinates ( x , y ) of newly constructed hostel. second type : 2 For query of 2nd type, you have to output the Rocket distance of Kth nearest hostel till now.

The Dean will always stay at his place ( origin ). It is gauranted that there will be atleast k queries of type 1 before first query of type 2.

Rocket distance between two points ( x2 , y2 ) and ( x1 , y1 ) is defined as (x2 - x1)2 + (y2 - y1)2
*/
    public static void main(String[] args) {
        //9 3
        //1 10 10
        //1 9 9
        //1 -8 -8
        //2
        //1 7 7
        //2
        //1 6 6
        //1 5 5
        //2

        hostelVisit();
    }

    public static void hostelVisit() {

        Scanner scn = new Scanner(System.in);

        int q = scn.nextInt();
        int k = scn.nextInt();

        PriorityQueue< Long > pq = new PriorityQueue<>(Collections.reverseOrder());

        while (q-- > 0) {

            int type = scn.nextInt();

            if (type == 1) {
                long x = scn.nextLong();
                long y = scn.nextLong();

                long dist = x * x + y * y;
                if (pq.size() < k) {
                    pq.add(dist);
                } else {
                    if (pq.peek() > dist) {
                        pq.poll();
                        pq.add(dist);
                    }
                }
            } else {
                System.out.println(pq.peek());
            }
        }
    }
}
