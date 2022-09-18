package Challenges_Trees_done;

import java.util.Scanner;

public class find_sum_at_k_naive_solution {
    /*

Take input of a generic tree using buildtree() function and also take input K the level at which we need to find the sum.

Input Format:-
Take a generic tree input where you are first given the data of the node and then its no of children.
The input is of preorder form and it is assured that the no of children will not exceed 2.
The input of the tree is followed by a single integer K.
*/

    static private class Node {
        int data;

        Node right;
        Node left;

        Node(int d) {
            data = d;
            right = left = null;
        }

    };

    static int sum = 0; // Variable to store final answer

    static void traverseTree(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            sum += root.data;
            return;
        }
        traverseTree(root.left, k - 1);
        traverseTree(root.right, k - 1);
    }

    static Scanner sc = new Scanner(System.in);

    static Node buildTree(Node root) {
        int d = sc.nextInt();
        int n = sc.nextInt();
        root = new Node(d);
        if (n == 0) {
            return root;
        } else if (n == 1) {
            root.left = buildTree(root.left);
            return root;
        } else {
            root.left = buildTree(root.left);
            root.right = buildTree(root.right);
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = buildTree(root);
        int k = sc.nextInt();
        traverseTree(root, k);
        System.out.println(sum);

        //1 2
        //2 2
        //3 0
        //4 0
        //5 2
        //6 0
        //7 0
        //2

        //Explanation
        //
        //Here the tree looks like
        //
        //                     1                                 Level 0
        //                /          \
        //              2              5                         Level 1
        //           /      \       /     \
        //          3       4      6        7                    Level 2
        //
        //Sum at Level 2 = 3 + 4 + 6 + 7 = 20
    }
}
