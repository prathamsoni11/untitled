package Queues;

public class SUQPopEfficient {
    private DynamicQueue primary;
    private DynamicQueue secondary;

    public SUQPopEfficient(){
        this.primary = new DynamicQueue();
        this.secondary = new DynamicQueue();
    }
    public int size(){
        return this.primary.size();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    //o(n)
    public void push(int data){
        while (this.primary.size() != 0){
            this.secondary.enqueue(this.primary.dequeue());
        }
        this.primary.enqueue(data);
        while (this.secondary.size() != 0){
            this.primary.enqueue(this.secondary.dequeue());
        }
    }
    //o(1)
    public int pop(){
        return this.primary.dequeue();
    }
    //o(1)
    public int top(){
        return this.primary.getFront();
    }
    //o(n)
    public void display(){
        this.primary.display();
    }
}
