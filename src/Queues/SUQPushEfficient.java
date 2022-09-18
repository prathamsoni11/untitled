package Queues;

public class SUQPushEfficient {
    private DynamicQueue primary;
    private DynamicQueue secondary;

    public SUQPushEfficient(){
        this.primary = new DynamicQueue(6);
        this.secondary = new DynamicQueue(6);
    }
    public int size(){
        return this.primary.size();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public void push(int data){
        this.primary.enqueue(data);
    }
    public int pop(){
        while (this.primary.size() != 1){
            secondary.enqueue(this.primary.dequeue());
        }
        int rv = this.primary.dequeue();
        while (this.secondary.size() != 0){
            this.primary.enqueue(this.secondary.dequeue());
        }
        return rv;
    }
    public int top(){
        while (this.primary.size() != 1){
            secondary.enqueue(this.primary.dequeue());
        }
        int rv = this.primary.dequeue();
        this.secondary.enqueue(rv);
        while (this.secondary.size() != 0){
            this.primary.enqueue(this.secondary.dequeue());
        }
        return rv;
    }
    public void display(){
        reverseQueue(this.primary);
        this.primary.display();
        reverseQueue(this.primary);
    }
    private static void reverseQueue(DynamicQueue queue){
        if (queue.isEmpty()){
            return;
        }
        int element = queue.dequeue();
        reverseQueue(queue);
        queue.enqueue(element);
    }
}
