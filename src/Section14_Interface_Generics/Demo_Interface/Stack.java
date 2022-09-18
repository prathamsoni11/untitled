package Section14_Interface_Generics.Demo_Interface;

public class Stack implements DynamicStackInterface {

    @Override
    public void push(int item) {
        System.out.println(StackInterface.size);
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
