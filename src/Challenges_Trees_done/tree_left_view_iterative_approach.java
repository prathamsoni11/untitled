package Challenges_Trees_done;

public class tree_left_view_iterative_approach {
    /*Given a binary tree , print its nodes from root to bottom as visible from left side of tree*/

//    static void printLeftSide(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//
//        boolean flag = true;
//
//        while (!q.isEmpty()) {
//            TreeNode f = q.peek();
//            if (f == null) {
//                q.remove();
//                if (!q.isEmpty()) {
//                    q.add(null);
//                }
//                flag = true;
//            } else {
//                if (flag) {
//                    System.out.print(f.data + " ");
//                    flag = false;
//                }
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

    public static void main(String[] args) {

        //1 2 3 4 5 -1 6 -1 -1 -1 -1 -1 -1

        //Explanation
        //
        //The tree looks like
        //
        //                 1
        //              /      \
        //           2           3
        //        /     \           \
        //       4       5           6
        //
        //When viewed from the left , we would see the nodes 1,2 and 4.
    }
}
