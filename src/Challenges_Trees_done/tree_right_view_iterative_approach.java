package Challenges_Trees_done;

public class tree_right_view_iterative_approach {


//    static void printRightSide(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//
//        int prev = 0;
//
//        while (!q.isEmpty()) {
//            TreeNode f = q.peek();
//            if (f == null) {
//                q.remove();
//                if (!q.isEmpty()) {
//                    q.add(null);
//                }
//                System.out.print(prev + " ");
//            } else {
//                prev = f.data;
//                q.remove();
//
//                if (f.left != null) {
//                    q.add(f.left);
//                }
//                if (f.right != null) {
//                    q.add(f.right);
//                }
//            }
//        }
//    }
}
