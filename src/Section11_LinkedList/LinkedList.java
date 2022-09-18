package Section11_LinkedList;

public class LinkedList {
    private class Node{
        int data;       // it refers to data in LL
        Node next;      // it refers to address of next element
    }
    private Node head;   // it refers to address of first element in LL
    private Node tail;   // it refers to address of last element in LL
    private int size;    // it refers to size of LL

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    // o(n)
    public void display(){
        Node temp = this.head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // o(1)
    public void addLast(int item){
        // create a new node
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if(this.size >= 1){
            this.tail.next =nn;
        }

        //summary object
        if (this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            this.tail = nn;
            this.size++;
        }
    }
    // o(1)
    public void addFirst(int item){
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        //attach
        if (this.size>=1){
            nn.next = head;
        }

        //summary
        if (this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else {
            this.head = nn;
            this.size++;
        }
    }
    // o(1)
    public int getFirst()throws Exception{
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }
        return this.head.data;
    }
    // o(1)
    public int getLast()throws Exception{
        if(this.size == 0){
            throw new Exception("LL is Empty");
        }
        return this.tail.data;
    }
    // o(n)
    public int getAt(int idx) throws Exception{
        if (this.size == 0){
            throw new Exception("LL is Empty");
        }
        if (idx < 0 || idx >= this.size ){
            throw new Exception("Invalid Index.");
        }
        Node temp = head;
        for(int i = 1 ; i <= idx ; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    // o(n)
    private Node getNodeAt(int idx) throws Exception{
        if (this.size == 0){
            throw new Exception("LL is Empty");
        }
        if (idx < 0 || idx >= this.size ){
            throw new Exception("Invalid Index.");
        }
        Node temp = head;
        for(int i = 1 ; i <= idx ; i++){
            temp = temp.next;
        }
        return temp;
    }
    // o(n)
    public void addAt(int item , int idx) throws Exception{
        if (idx < 0 || idx > size){
            throw new Exception("Invalid Index");
        }
        if (idx == 0){
            addFirst(item);
        }
        else if(idx == this.size){
            addLast(item);
        }
        else{
            // create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            //attach
            Node nm1 = getNodeAt(idx-1);
            Node np1 = nm1.next;

            nm1.next = nn;
            nn.next = np1;

            //summary update
            this.size++;
        }
    }
    // o(1)
    public int removeFirst() throws Exception{
        if (this.size == 0){
            throw new Exception("LL is empty");
        }
        int rv = this.head.data;
        if (this.size == 1){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }else{
            this.head = this.head.next;
            this.size--;
        }
        return rv;
    }
    // o(n)
    public int removeLast()throws Exception{
        if (this.size == 0){
            throw new Exception("LL is empty");
        }
        int rv = this.tail.data;
        if (this.size == 1){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }else{
            Node sizem2 = getNodeAt(this.size-2);
            this.tail = sizem2;
            this.tail.next = null;
            this.size--;
        }
        return rv;
    }
    // o(n)
    public int removeAt(int idx)throws Exception{
        if (this.size == 0){
            throw new Exception("LL is Empty");
        }
        if (idx < 0 || idx >= size){
            throw new Exception("Invalid Index");
        }
        if (idx == 0){
            return removeFirst();
        }else if (idx == this.size-1){
            return removeLast();
        }else {
            Node nm1 = getNodeAt(idx-1);
            Node n = nm1.next;
            Node np1 = n.next;

            nm1.next = np1;
            this.size--;

            return n.data;
        }
    }

    public void reverseData() throws Exception{
        int left = 0;
        int right = this.size-1;

        while (left<right){
            Node ln = getNodeAt(left);
            Node rn = getNodeAt(right);

            int temp = ln.data;
            ln.data = rn.data;
            rn.data = temp;

            left++;
            right--;
        }
    }

    public void reversePointers()throws Exception{
        Node prev = this.head;
        Node curr = prev.next;

        while (curr != null){
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        // swap
        Node t = this.head;
        this.head = this.tail;
        this.tail = t;
        this.tail.next = null;
    }

    public int mid(){
        Node slow = this.head;
        Node fast = this.head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }    // we can use size() also to execute mid by sending size/2 getNodeAt

    public int kthNode_From_End(int k) throws Exception{
        if (k<= 0 || k>this.size){
            throw new Exception("Invalid value of K");
        }
        Node slow = this.head;
        Node fast = this.head;

        for (int i = 1 ; i <= k ; i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public int find(int data){
        int index = 0;
        for (Node temp = this.head ; temp != null ; temp = temp.next){
            if (temp.data == data){
                return index;
            }
            index++;
        }
        return -1;
    }
}
