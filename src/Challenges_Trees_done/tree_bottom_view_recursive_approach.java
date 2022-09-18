package Challenges_Trees_done;

public class tree_bottom_view_recursive_approach {
    // Given a binary tree , print the nodes in left to right manner as visible from below the tree

//    public  void bottomView() {
//
//        HashMap map = new HashMap<>();
//        dfs(root, 0, 0, map);
//        ArrayList keys = new ArrayList<>(map.keySet());
//        Collections.sort(keys);
//
//        for (int key : keys) {
//            System.out.print(map.get(key).data + " ");
//        }
//
//        // display(root);
//
//    }
//
//    public  void dfs(Node root, int vlevel, int ht, HashMap map) {
//
//        if (root == null) {
//            return;
//        }
//
//
//        if (!map.containsKey(vlevel)) {
//            Pair np = new Pair();
//            np.data = root.data;
//            np.ht = ht;
//            map.put(vlevel, np);
//        } else {
//
//            if (map.get(vlevel).ht <= ht) {
//                map.get(vlevel).ht = ht;
//                map.get(vlevel).data = root.data;
//            }
//        }
//
//        dfs(root.left, vlevel - 1, ht + 1, map);
//        dfs(root.right, vlevel + 1, ht + 1,  map);
//    }
//
//    class Pair {
//
//        int ht;
//        int data;
//    }


    public static void main(String[] args) {
        //1 2 3 4 5 6 -1 -1 -1 -1 -1 -1 -1

        //Explanation
        //
        //The tree looks like
        //
        //                 1
        //              /      \
        //           2           3
        //        /     \       /
        //       4       5     6
        //
        //(Note that 5 and 6 are at the same position so we consider the right one to lower)
    }
}
