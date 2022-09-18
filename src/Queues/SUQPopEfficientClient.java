package Queues;

public class SUQPopEfficientClient {
    public static void main(String[] args) {
        SUQPopEfficient stack = new SUQPopEfficient();
        for(int i = 1 ; i <= 5 ; i++){
            stack.push(i*10);
        }
        stack.display();
        System.out.println(stack.top());
        System.out.println(stack.pop());
        stack.display();

    }
}
