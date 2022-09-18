package Challenges_Trees_done;

import java.util.Scanner;

public class delete_nodes_from_bst {
    /*
You are given an array A1 of integers. You have to form first Binary Search tree and then you are provided another array A2.
You have to delete each node from the BST which is present in the array A2. Now you have to print preorder traversal of the tree.
It is assured that the elements of array A2 will be present in the tree.

Note : In case of node with 2 children, consider its inorder successor as its replacement.

Input Format:-
First line contains integer t as number of test cases.
Each test case contains four lines.
 First line contains integer n which represents the length of the array A1 and next line contains n space separated integers denoting the elements of array A1.
 Similarly third line contains integer m which represents the length of the array A2 and next line contains m space separated integers denoting the elements of array A2.
*/

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }

    static public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        return delete(root, key);

    }

    static public TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (root.val < key) {
            root.right = delete(root.right, key);
        } else if (root.val > key) {
            root.left = delete(root.left, key);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            TreeNode temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            root.val = temp.val;
            root.right = delete(root.right, root.val);
        }

        return root;
    }

    static TreeNode insertInBST(TreeNode root, int data) {
        // Base Case
        if (root == null) {
            return new TreeNode(data);
        }
        // Rec Case - Insert in the Subtree and Update Pointers
        if (data <= root.val) {
            root.left = insertInBST(root.left, data);
        } else {
            root.right = insertInBST(root.right, data);
        }
        return root;
    }

    static void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();

            TreeNode root = null;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                root = insertInBST(root, x);
            }

            int m = sc.nextInt();
            while (m-- > 0) {
                int x = sc.nextInt();
                root = deleteNode(root, x);
            }

            preorder(root);
        }

        //1
        //7
        //5 3 2 4 7 6 8
        //3
        //2 3 5

        //Explanation
        //
        //Initially the tree looks like
        //
        //                 5
        //              /      \
        //           3           7
        //        /     \      /    \
        //       2       4    6      8
        //
        //After the deletion , the tree looks like
        //
        //                   6
        //                /     \
        //               4       7
        //                         \
        //                          8
        //
        //We print the preorder of the final tree.
    }
}
