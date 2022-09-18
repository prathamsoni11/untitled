package Challenges_Trees_done;

public class tree_top_view_iterative_approach {

//    static void topViewIterative(TreeNode root) {
//        Queue<NodeIntPair> qu = new LinkedList<>();
//        qu.add(new NodeIntPair(root, 0));
//        Map<Integer, Integer> mp = new TreeMap<>();
//        while (!qu.isEmpty()) {
//            TreeNode temp = qu.peek().first;
//            int dist = qu.peek().second;
//            qu.remove();
//            if (!mp.containsKey(dist)) {
//                mp.put(dist, temp.data);
//            }
//            if (temp.left != null) {
//                qu.add(new NodeIntPair(temp.left, dist - 1));
//            }
//            if (temp.right != null) {
//                qu.add(new NodeIntPair(temp.right, dist + 1));
//            }
//        }
//
//        mp.forEach((k, v) -> System.out.print(v + " "));
//    }
}
