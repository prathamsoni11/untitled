package Section11_LinkedList;

public class LL_As_Queue_Client {
    public static void main(String[] args)throws Exception {
        LL_As_Queue queue = new LL_As_Queue();

        queue.enqueue(10);
        queue.display();

        queue.enqueue(20);
        queue.display();

        queue.enqueue(30);
        queue.display();

        queue.enqueue(40);
        queue.display();

        queue.dequeue();
        queue.display();

        System.out.println(queue.front());
        System.out.println(queue.size());
    }
}
