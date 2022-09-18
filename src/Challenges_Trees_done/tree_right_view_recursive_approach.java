package Challenges_Trees_done;

public class tree_right_view_recursive_approach {
    // Given a binary tree , print its nodes from root to bottom as visible from right side of tree

//    public  void RightView() {
//
//        int[] maxLevel = new int[1];
//        maxLevel[0] = -1;
//        dfs(root, 0, maxLevel);
//
//    }
//
//    public  void dfs(Node root, int level, int[] maxLevel) {
//
//        if (root == null) {
//            return;
//        }
//
//
//        if(level > maxLevel[0]){
//            System.out.print(root.data+" ");
//            maxLevel[0] = level;
//        }
//
//        dfs(root.right, level + 1, maxLevel);
//        dfs(root.left, level + 1, maxLevel);
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
        //When viewed from the left , we would see the nodes 1,3 and 6.
    }
}
