package Section14_Interface_Generics.Demo_Interface;

public interface StackInterface {

    int size = 0;      // this will be static as well as final

    public void push(int item);
    public int pop();

}
