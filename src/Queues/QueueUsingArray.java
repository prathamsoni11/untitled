package Queues;

public class QueueUsingArray {
    protected int[] arr;
    private int cs;
    private int front;
    private int rear;

    public static int DEFAULT_CAPACITY = 10;

    QueueUsingArray(){
        this(DEFAULT_CAPACITY);
    }
    QueueUsingArray(int capacity){
        this.arr = new int[capacity];
        this.cs = 0;
        this.front = 0;
        this.rear = capacity-1;
    }
    public int size(){
        return this.cs;
    }
    public boolean isFull(){
        return this.cs == this.arr.length;
    }
    public boolean isEmpty(){
        return this.cs == 0;
    }
    public void enqueue(int data){
        if(!this.isFull()){
            this.rear = (this.rear+1)%arr.length;
            this.arr[this.rear] = data;
            this.cs = this.cs+1;
        }
    }
    public int dequeue(){
        int item = this.front;
        if(!this.isEmpty()){
            this.front = (this.front+1)% this.arr.length;
            this.cs = this.cs-1;
        }
        return this.arr[item];
    }

    public int getFront(){
        return this.arr[this.front];
    }
    public void display(){
        int inx = this.front;
        for(int i = 0 ; i < this.size() ; i++){
            System.out.print(this.arr[inx]+" ");
            inx = (inx+1)%arr.length;
        }
        System.out.println();
    }
}
