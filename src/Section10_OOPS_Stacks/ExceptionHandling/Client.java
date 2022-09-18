package Section10_OOPS_Stacks.ExceptionHandling;

public class Client {
    public static void main(String[] args) {   //try and catch does not require throws Exception

        System.out.println("Hello");
        Student s1 = new Student();
        try {
            s1.setAge(-10);
            System.out.println("after statement");
        }catch (Exception e){
            System.out.println("in catch block");
        }
        System.out.println("Bye");

    }
}
