package Queues;



public class DynamicReverseQueue {
    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(6);
        for (int i = 1 ; i <= 6 ; i++) {
            queue.enqueue(i * 10);
        }
        queue.dequeue();
        queue.enqueue(70);
        queue.display();
        reverseQueue(queue);
        queue.display();
    }
    public static void reverseQueue(DynamicQueue queue){
        if (queue.isEmpty()){
            return;
        }
        int element = queue.dequeue();
        reverseQueue(queue);
        queue.enqueue(element);
    }
}
