package Challenges_Trees_done;

import java.util.Scanner;

public class is_balanced_binary_tree {
    /*

Given a Binary tree check if it is balanced i.e.
depth of the left and right sub-trees of every node differ by 1 or less.

Input Format:-
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL
*/

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        is_balanced_binary_tree m = new is_balanced_binary_tree();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());

        //10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false

        //Explanation
        //
        //The tree looks like
        //
        //                 10
        //              /       \
        //           20           30
        //        /     \       /     \
        //       40      50    60      73
        //
        //The given tree is clearly balanced as depths of the left and right sub-trees of every node differ by 1 or less.
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public boolean isBalanced() {
            return this.isBalanced(this.root).isBalanced;
        }

        private BalancedPair isBalanced(Node node) {
            BalancedPair p = new BalancedPair();
            if (node == null) {
                p.height = 0;
                p.isBalanced = true;
                return p;
            }


            BalancedPair left = isBalanced(node.left);
            BalancedPair right = isBalanced(node.right);

            p.height = Math.max(left.height, right.height) + 1;
            p.isBalanced = left.isBalanced && right.isBalanced && (Math.abs(left.height - right.height) <= 1);

            return p;
        }

        private class BalancedPair {
            int height;
            boolean isBalanced;
        }

    }
}
