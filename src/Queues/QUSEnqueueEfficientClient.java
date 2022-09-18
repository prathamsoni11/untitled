package Queues;

public class QUSEnqueueEfficientClient {
    public static void main(String[] args)throws Exception {
        QueueUsingStackEnqueueEfficient queue = new QueueUsingStackEnqueueEfficient();
        for (int i = 1 ; i <= 5 ; i++){
            queue.enqueue(i*10);
        }
        queue.display();

        System.out.println(queue.dequeue());

        queue.display();
    }
}
