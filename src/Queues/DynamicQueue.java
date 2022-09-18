package Queues;

public class DynamicQueue extends QueueUsingArray{
    public DynamicQueue(){
        this(DEFAULT_CAPACITY);
    }
    public DynamicQueue(int capacity){
        super(capacity);
    }
    public void enqueue(int item){
        if(isFull()){
            int[] array = new int[2* this.arr.length];
            for(int i = 0 ; i < this.size() ; i++){
                array[i] = this.arr[i];
            }
            this.arr = array;
        }
        super.enqueue(item);
    }
}
