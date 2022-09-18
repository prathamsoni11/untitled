package Challenges_Trees_done;

import java.util.Scanner;

public class create_tree_using_preorder_and_inorder {
    /*

Given preorder and inorder create the tree

Input Format:-
Enter the size of the preorder array N then add N more elements and store in the array denoting the preorder traversal of the tree.
Then enter the size of the inorder array M and add M more elements and store the inorder traversal of the array.
*/

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        create_tree_using_preorder_and_inorder m = new create_tree_using_preorder_and_inorder();
        int[] pre = takeInput();
        int[] in = takeInput();
        BinaryTree bt = m.new BinaryTree(pre, in);
        bt.display();

        //3
        //1 2 3
        //3
        //3 2 1

        //Explanation
        //
        //The above tree looks like
        //
        //             1
        //           /
        //         2
        //       /
        //     3
    }

    public static int[] takeInput() {
        int n = scn.nextInt();

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] pre, int[] in) {
            this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
            if (plo > phi) {

                return null;

            }

            Node nn = new Node();
            nn.data = pre[plo];

            int j = 0;
            for (int i = ilo; i <= ihi; i++) {
                if (in[i] == pre[plo]) {
                    j = i;
                    break;
                }
            }

            nn.left = construct(pre, plo + 1, plo + j - ilo, in, ilo, j - 1);
            nn.right = construct(pre, plo + 1 + j - ilo, phi, in, j + 1, ihi);

            return nn;
        }

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

    }
}
