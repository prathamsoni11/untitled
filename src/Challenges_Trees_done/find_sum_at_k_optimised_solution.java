package Challenges_Trees_done;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class find_sum_at_k_optimised_solution {
    static private class Node {
        int data;

        Node right;
        Node left;

        Node(int d) {
            data = d;
            right = left = null;
        }

    }

    static int sumAtLevelK(Node root, int k) {
        if (root == null)
            return 0;

        int ans = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        boolean flag = false;

        while (!q.isEmpty()) {
            Node f = q.peek();
            if (f == null) {
                q.remove();
                if (!q.isEmpty()) {
                    q.add(null);
                }
                k--;
                if (flag)
                    break;
                if (k == 0)
                    flag = true;
            } else {
                if (flag)
                    ans += f.data;
                q.remove();

                if (f.left != null) {
                    q.add(f.left);
                }
                if (f.right != null) {
                    q.add(f.right);
                }
            }
        }

        return ans;
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
        int ans = sumAtLevelK(root, k);
        System.out.println(ans);
    }
}
