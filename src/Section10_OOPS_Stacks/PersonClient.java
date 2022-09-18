package Section10_OOPS_Stacks;

public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person();        //when an object is called then at first all the statements of
        Person p2 = new Person();        // constructors will be executed then rest of code below this object will run
        Person p3 = new Person(25);  // this is for parameterised constructor


        System.out.println("********************");
        // This is for default access specifiers
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//
//        p2.name = "A";
//        p2.age = 10;
//
//        System.out.println(p2.name);
//        System.out.println(p2.age);

        System.out.println("********************");
        /* This is for private access specifiers to access through getter and setter
           to access in other class */
        /* Note:- This is also only visible when getter and setter are public not private
           if get and set are private than you can't access it on another class */
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        p2.setName("A");
        p2.setAge(10);    // or p2.setAge('A')   //this return ascii code of A and this is valid

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());

        System.out.println("********************");
    }
}
