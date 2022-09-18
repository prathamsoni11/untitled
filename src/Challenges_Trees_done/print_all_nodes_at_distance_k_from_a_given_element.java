package Challenges_Trees_done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class print_all_nodes_at_distance_k_from_a_given_element {
    /*
Given a binary tree, a target node in the binary tree, and an integer value k, print all the nodes that are at distance k from the given target node.
No parent pointers are available. Print 0 if no such node exist at distance k.

Input Format:-
The first line of input will contain an integer n.
The next line will contain n integers denoting the the preorder traversal of the BT.
The next line will contain n more integers denoting the inorder traversal of the BT.
The next line will contain an integer T.
Then T lines follow you will be given 2 integers the first one denoting the value of Node and the second one denoting the value of k.
*/

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private int size;

    public int size() {
        return this.size;
    }

    public boolean isempty() {
        return this.size == 0;
    }

    public print_all_nodes_at_distance_k_from_a_given_element() {}

    ////////////////// New Constructor//////////

    public print_all_nodes_at_distance_k_from_a_given_element(int[] pre, int[] in) {
        // this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length -
        // 1);//for preorder
        this.root = this.construct(pre, in, 0, in.length - 1);// for
        // postorder

    }

    private int search(int[] arr, int si, int ei, int data) {
        for (int i = si; i <= ei; i++) {
            if (arr[i] == data)
                return i;
        }
        return -1;
    }


    private static int preIndex = 0;

    private Node construct(int[] pre, int[] in, int isi, int iei) {
        if (isi > iei) {
            return null;
        }
        Node tNode = new Node(pre[preIndex++], null, null);

        if (isi == iei) {
            return tNode;
        }

        int inIndex = search(in, isi, iei, tNode.data);
        tNode.left = construct(pre, in, isi, inIndex-1);
        tNode.right = construct(pre, in, inIndex+1, iei);
        return tNode;

    }



    private void printKDistanceNodedown(Node node, int k,ArrayList<Integer> arr) {
        if(node == null || k<0) {
            return ;
        }
        if(k==0) {
//            System.out.println(node.data);
            arr.add(node.data);
            return;
        }
        printKDistanceNodedown(node.left, k-1, arr);
        printKDistanceNodedown(node.right, k-1, arr);

    }

    private int printkNodeDistance(Node node, int target, int k, ArrayList<Integer> arr) {
        if(node == null) {
            return -1;
        }
        if(node.data == target) {
            printKDistanceNodedown(node, k,arr);
            return 0;
        }
        int dl = printkNodeDistance(node.left, target, k, arr);
        if(dl!=-1) {
            if(dl+1==k) {
//                System.out.println(node.data);
                arr.add(node.data);
            }
            else {
                printKDistanceNodedown(node.right, k - dl - 2,arr);
            }
            return 1+dl;
        }
        int dr = printkNodeDistance(node.right, target, k, arr);
        if(dr!=-1) {
            if(dr+1 == k) {
//                System.out.println(node.data);
                arr.add(node.data);

            } else {
                printKDistanceNodedown(node.left, k - dr - 2,arr);
            }
            return 1+dr;
        }
        return -1;
    }

    public ArrayList<Integer> printkNodeDistance(int target, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        printkNodeDistance(this.root, target, k, arr);
        Collections.sort(arr);
        return arr;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] pre = new int[n];
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i]=scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            in[i]=scn.nextInt();
        }

        print_all_nodes_at_distance_k_from_a_given_element bt = new print_all_nodes_at_distance_k_from_a_given_element(pre, in);
//        bt.display();
        int t=scn.nextInt();
        while(t-- > 0) {
            int tar = scn.nextInt();
            int k=scn.nextInt();
            ArrayList<Integer> a= bt.printkNodeDistance(tar, k);
            for(int i:a) {
                System.out.print(i+" ");
            }
            if(a.size()==0) {
                System.out.print(0);
            }
            System.out.println();
        }

        //4
        //60 65 50 70
        //50 65 60 70
        //2
        //60 1
        //65 2

        //Explanation
        //
        //The tree looks like
        //
        //                 60
        //              /      \
        //           65         70
        //         /
        //      50
        //
        //For testcase 1 : The nodes 65 and 70 are the only ones at distance k=1 from 60.
        //For testcase 2 : The node 70 is at distance k=2 from 65.
    }
}
