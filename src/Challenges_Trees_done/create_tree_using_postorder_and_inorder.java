package Challenges_Trees_done;

import java.util.Scanner;

public class create_tree_using_postorder_and_inorder {
    /*

Given postorder and inorder traversal of a tree. Create the original tree on given information.

Input Format:-
Enter the size of the postorder array N then add N more elements and store in the array, then enter the size of the inorder array M and add M more elements and store in the array. here M and N are same.
*/

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        create_tree_using_postorder_and_inorder m = new create_tree_using_postorder_and_inorder();
        int[] post = takeInput();
        int[] in = takeInput();
        BinaryTree bt = m.new BinaryTree(post, in);
        bt.display();

        //3
        //1
        //3
        //2
        //3
        //1
        //2
        //3
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

        public BinaryTree(int[] post, int[] in) {
            this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
            if (plo > phi) {
                return null;

            }

            Node nn = new Node();

            nn.data = post[phi];

            int j = 0;
            for (int i = ilo; i <= ihi; i++) {
                if (in[i] == post[phi]) {
                    j = i;
                    break;
                }
            }

            int nel = j - ilo;
            nn.left = construct(post, plo, plo + nel - 1, in, ilo, j - 1);
            nn.right = construct(post, plo + nel, phi - 1, in, j + 1, ihi);

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
