package Challenges_linkedList_done;

import java.util.Scanner;

public class merge_sorted_LL {
    // Given 2 sorted linked lists , merge the two given sorted linked list and print the final Linked List.
    
    private class Node {

        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else

        {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }

        return fn.data;
    }

    public void merge_sorted_list(merge_sorted_LL other) throws Exception {
        merge_sorted_LL ll = new merge_sorted_LL();         // Tostore the final Linked List

        Node temp1 = this.head;                  // Start from the first list
        Node temp2 = other.head;                // Start from the second list

        while(temp1 != null && temp2 != null){    // Iterate on both simultaneously

            if(temp1.data < temp2.data){      // If data of first list is less
                ll.addLast(temp1.data);             // add into the list
                temp1 = temp1.next;                 // Update the iterator
            }else{

                ll.addLast(temp2.data);          // otherwise add data of list2
                temp2 = temp2.next;              // Update the iterator

            }
        }

        while(temp1 != null){   // Till list1 is not empty

            ll.addLast(temp1.data);
            temp1 = temp1.next;

        }

        while(temp2 != null){   // Till list2 is not empty
            ll.addLast(temp2.data);
            temp2 = temp2.next;
        }

        ll.display();

    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        int t = scn.nextInt();

        while(t > 0){

            merge_sorted_LL list1 = new merge_sorted_LL();
            int n1 = scn.nextInt();

            for (int j = 0; j < n1; j++) {
                int item = scn.nextInt();
                list1.addLast(item);
            }

            merge_sorted_LL list2 = new merge_sorted_LL();
            int n2 = scn.nextInt();

            for (int j = 0; j < n2; j++) {
                int item = scn.nextInt();
                list2.addLast(item);
            }
            list1.merge_sorted_list(list2);

            t--;
        }

        //1
        //4
        //1 3 5 7
        //3
        //2 4 6
    }
}
