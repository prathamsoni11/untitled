package Section11_LinkedList;

public class Client {
    public static void main(String[] args)throws Exception {
        LinkedList list = new LinkedList();

        System.out.println("-------------------------");
        System.out.println("addLast");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        list.display();
        System.out.println("-------------------------");
        System.out.println("addFirst");
//        list.addFirst(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(40);
//        list.addFirst(50);
//        list.display();
        System.out.println("-------------------------");
        System.out.println("getFirst");
//        System.out.println(list.getFirst());

        System.out.println("-------------------------");
        System.out.println("getLast");
//        System.out.println(list.getLast());

        System.out.println("-------------------------");
        System.out.println("reversePointers");
//        list.reversePointers();
//        list.display();

        System.out.println("-------------------------");
        System.out.println("mid");
//        System.out.println(list.mid());

        System.out.println("-------------------------");
        System.out.println("kthNode_From_End");
        System.out.println(list.kthNode_From_End(2));

        System.out.println(list.find(30));
    }

}
