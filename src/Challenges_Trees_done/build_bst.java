package Challenges_Trees_done;

import java.util.Scanner;

public class build_bst {
    /*

You are given a sorted data of n integers.
You have to form a balanced Binary Search Tree and then print preorder traversal of the tree.

Input Format:-
First line contains integer t as number of test cases.
Each test case contains following input.
First line contains integer n which represents the length of the data and next line contains n space separated integers denoting the elements for the BST.
*/

    private class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public build_bst(int[] in) {
        this.root = construct(in, 0, in.length - 1);
    }

    private Node construct(int[] in, int lo, int hi) {

        if (lo > hi) {
            return null;
        }

        int mid = (lo + hi) / 2;

        Node nn = new Node();
        nn.data = in[mid];

        nn.left = construct(in, lo, mid - 1);
        nn.right = construct(in, mid + 1, hi);

        return nn;

    }

    public void display(){
        display(this.root);
    }

    public void display(Node root) {

        if(root == null) return;

        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);

    }

    public static void main(String[] args){

        int t = scn.nextInt();

        while(t-- > 0){
            int[] inorder = takeinput();
            build_bst tree = new build_bst(inorder);
            tree.display();
        }

        //1
        //7
        //1 2 3 4 5 6 7

        //Explanation
        //
        //The tree looks like
        //
        //                 4
        //              /      \
        //           2           6
        //        /     \      /    \
        //       1       3    5      7
        //
        //We print the preorder of the final tree.
    }

    static Scanner scn = new Scanner(System.in);

    public static int[] takeinput() {

        int n = scn.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        return array;
    }
}
