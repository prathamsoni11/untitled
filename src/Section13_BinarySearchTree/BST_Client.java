package Section13_BinarySearchTree;

public class BST_Client {
    public static void main(String[] args) {
        int[] in = {10,20,30,40,50,60,70};
        BST bst = new BST(in);
        bst.display();
        System.out.println(bst.find(30));

        bst.add(55);
        bst.display();

        System.out.println(bst.max());

        bst.remove(40);
        bst.display();
    }
}
