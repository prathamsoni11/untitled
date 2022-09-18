package Challenges_Trees_done;

public class print_bst_keys_in_given_range {
    /*

You are given an array of integers. First of all , You have to form a binary search tree from given integers.
Now you have provided two integers k1 and k2. You have to print all nodes of BST within the range k1 and k2 (including k1 and k2).
Input Format:-
First line contains integer t as number of test cases. Each test case contains three lines.
First line contains an integer n which is length of the array and second line contains n space separated integer.
Third line contains the value of k1 and k2.
*/

//    public void printInRange(int lo, int hi) {
//        printInRange(root, lo, hi);
//    }
//
//    private void printInRange(Node node, int lo, int hi) {
//
//        if (node == null) {
//            return;
//        }
//
//        if (node.data < lo) {
//            printInRange(node.right, lo, hi);
//        } else if (node.data > hi) {
//            printInRange(node.left, lo, hi);
//        } else {
//
//            printInRange(node.left, lo, hi);
//            System.out.println(node.data);
//            printInRange(node.right, lo, hi);
//        }
//
//    }
    public static void main(String[] args) {
        //1
        //5
        //4 3 2 5 6
        //3 5

        //Explanation
        //
        //The tree looks like
        //
        //                 4
        //              /      \
        //           3           5
        //        /                \
        //       2                  6
        //
        //The nodes between the range 3 to 5 are 3,4,5.
    }
}
