package Section10_OOPS_Stacks.Inheritance;

public class Child extends Parent{
    int d = 20;
    int d2 = 200;

    @Override
    public void fun(){
        System.out.println("In C Fun");
    }

    public void fun2(){
        System.out.println("In C Fun2");
    }
}
