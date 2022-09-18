package Challenges_Trees_done;

import java.util.Scanner;

public class replace_with_sum_of_greater_nodes {
    /*

Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it.
Include the current node's data also.

Input Format:-
The first line contains a number n showing the length of the inorder array of BST.
The next line contains n integers denoting the elements of the array.
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

    public replace_with_sum_of_greater_nodes(int... sa) {
        this.root = this.construct(sa, 0, sa.length - 1);
    }

    private Node construct(int[] sa, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        Node rv = new Node(sa[mid], null, null);
        this.size++;
        rv.left = this.construct(sa, lo, mid - 1);
        rv.right = this.construct(sa, mid + 1, hi);
        return rv;
    }

    public void modifyBST() {
        int[] arr = {0};
        this.modifyBSTwithgreaterelementssum(this.root, arr);
    }

    private void modifyBSTwithgreaterelementssum(Node node, int[] sum) {
        if(node == null)
            return;
        modifyBSTwithgreaterelementssum(node.right, sum);
        sum[0]+=node.data;
        node.data = sum[0];
        modifyBSTwithgreaterelementssum(node.left, sum);
    }

    public void preorder() {
        pre_order(this.root);
    }

    private void pre_order(Node node) {
        if(node ==null) return;
        System.out.print(node.data+" ");
        pre_order(node.left);
        pre_order(node.right);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        replace_with_sum_of_greater_nodes b = new replace_with_sum_of_greater_nodes(arr);
        b.modifyBST();
        b.preorder();

        //7
        //20
        //30
        //40
        //50
        //60
        //70
        //80


        //Explanation
        //
        //The original tree looks like
        //
        //            50
        //        /        \
        //      30          70
        //    /    \       /   \
        //  20    40      60    80
        //
        //We are supposed to replace the elements by the sum of elements larger than it.
        //80 being the largest element remains unaffected .
        //70 being the second largest element gets updated to 150 (70+80)
        //60 becomes 210 (60 + 70 + 80)
        //50 becomes 260 (50 + 60 + 70 + 80)
        //40 becomes 300 (40 + 50 + 60 + 70 + 80)
        //30 becomes 330 (30 + 40 + 50 + 60 + 70 + 80)
        //20 becomes 350 (20 + 30 + 40 + 50 + 60 + 70 + 80)
        //
        //The new tree looks like
        //
        //           260
        //        /        \
        //     330         150
        //    /    \       /   \
        //  350    300   210    80
        //
        //The Pre-Order traversal (Root->Left->Right) looks like :
        //260 330 350 300 150 210 80.
    }
}
