package Challenges_Hashing_and_tries_done;

import java.util.*;

public class vertical_order_print_binary_tree {
    /*
You will be given a Binary Tree. Your task is to print the binary tree in Vertical Fashion.
The image below describes how we define a vertical traversal of a tree.

Input Format:-
You will be given an Integer N denoting the number of levels in the corresponding tree.
On the next line you will be given (2^N)-1 integers denoting the level order input for the tree. If at any level any node is absent then that will denoted by -1 and every integer other than -1 shows the presence of a node at that level.
*/

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int d) {
            data = d;
            left = null;
            right = null;
        }
    };

    static Scanner sc = new Scanner(System.in);

    static TreeNode buildTreeLevelWise() {

        int d = sc.nextInt();

        TreeNode root = new TreeNode(d);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TreeNode f = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            if (c1 != -1) {
                f.left = new TreeNode(c1);
                q.add(f.left);
            }
            if (c2 != -1) {
                f.right = new TreeNode(c2);
                q.add(f.right);
            }
        }
        return root;
    }

    static void verticalOrderPrint(TreeNode root, Map<Integer, ArrayList<Integer>> m, int d) {
        if (root == null) {
            return;
        }
        if (!m.containsKey(d)) {
            m.put(d, new ArrayList<>());
        }
        m.get(d).add(root.data);
        verticalOrderPrint(root.left, m, d - 1);
        verticalOrderPrint(root.right, m, d + 1);
    }

    public static void main(String[] args) {
        int levels = sc.nextInt();
        TreeNode root = buildTreeLevelWise();

        Map<Integer, ArrayList<Integer>> m = new TreeMap<>();

        verticalOrderPrint(root, m, 0);

        m.forEach((hd, array) -> {
            array.forEach(x -> System.out.print(x + " "));
            System.out.println();
        });

        // 4 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1
    }
}
