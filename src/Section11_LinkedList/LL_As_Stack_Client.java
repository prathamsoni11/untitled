package Section11_LinkedList;

public class LL_As_Stack_Client {
    public static void main(String[] args) throws Exception{
        LL_As_Stack stack = new LL_As_Stack();

        stack.push(10);
        stack.display();

        stack.push(20);
        stack.display();

        stack.push(30);
        stack.display();

        stack.push(40);
        stack.display();

        System.out.println(stack.pop());
        stack.display();

        System.out.println(stack.top());

        System.out.println(stack.size());

    }
}
