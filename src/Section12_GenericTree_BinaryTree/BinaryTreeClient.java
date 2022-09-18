package Section12_GenericTree_BinaryTree;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree tree = new  BinaryTree();
        tree.display();
        // 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
//        System.out.println("Height of tree is " + tree.height());
        tree.preOrder();
        tree.postOrder();
        tree.inOrder();
        tree.levelOrder();
        // 50 true 25 true 12 false false true 48 true 27 false false false true 75 true 62 false false true 87 false false
        System.out.println(tree.isBST());

        System.out.println(tree.inOrderTraversal());

        System.out.println(tree.diameter());

        System.out.println(tree.diameterBetter());

        System.out.println(tree.sumLeaf());
    }
}
