package Challenges_Trees_done;

import java.util.Scanner;

public class structurally_identical_binary_tree {
    /*

Given two trees check if they are structurally identically.
Structurally identical trees are trees that have same structure.
They may or may not have the same data though.

Input Format:-
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL
*/

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        structurally_identical_binary_tree m = new structurally_identical_binary_tree();
        BinaryTree bt1 = m.new BinaryTree();
        BinaryTree bt2 = m.new BinaryTree();
        System.out.println(bt1.structurallyIdentical(bt2));

        //10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
        //10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
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

        public boolean structurallyIdentical(BinaryTree other) {
            return this.structurallyIdentical(this.root, other.root);
        }

        private boolean structurallyIdentical(Node tnode, Node onode) {
//            if (tnode == null && onode == null)
//                return true;
//            if (size(tnode) != size(onode))
//                return false;
//
//            boolean rr = structurallyIdentical(tnode.left, onode.left);
//            if (!rr)
//                return false;
//            rr = structurallyIdentical(tnode.right, onode.right);
//            if (!rr)
//                return false;

            return true;

        }

    }

}
