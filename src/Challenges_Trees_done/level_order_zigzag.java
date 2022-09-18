package Challenges_Trees_done;

import java.util.LinkedList;
import java.util.Scanner;

public class level_order_zigzag {
    /*
Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on.
This means odd levels should get printed from left to right and even levels should be printed from right to left.

Input Format:-
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL
*/

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        level_order_zigzag m = new level_order_zigzag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();

        // 10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
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

        public void levelOrderZZ() {
            LinkedList list = new LinkedList<>();
            LinkedList stack = new LinkedList<>();
            list.addLast(this.root);

            int count = 0;

            while (!list.isEmpty()) {
                Node rn = (Node) list.removeFirst();

                if (rn != null) {
                    System.out.print(rn.data + " ");

                    if (count % 2 == 0) {

                        stack.addFirst(rn.left);
                        stack.addFirst(rn.right);

                    } else

                    {
                        stack.addFirst(rn.right);
                        stack.addFirst(rn.left);

                    }
                }
                if (list.isEmpty()) {
                    // System.out.println();
                    list = stack;
                    stack = new LinkedList<>();
                    count++;
                }

            }
        }

    }
}
