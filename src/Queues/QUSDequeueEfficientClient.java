package Queues;

public class QUSDequeueEfficientClient {
    public static void main(String[] args) throws Exception {
        QUSDequeueEfficient queue = new QUSDequeueEfficient();
        for(int i = 1 ; i<=5;i++){
            queue.enqueue(i*10);
        }

        queue.display();

        System.out.println(queue.dequeue());

        queue.display();

        System.out.println(queue.front());

    }
}
