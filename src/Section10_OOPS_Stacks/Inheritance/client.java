package Section10_OOPS_Stacks.Inheritance;

public class client {
    public static void main(String[] args) {

        System.out.println(" - - Case 1 - - ");
        System.out.println("Reference - P and Instance - P");
        Parent obj1 = new Parent();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        obj1.fun();
        obj1.fun1();


        System.out.println(" - - Case 2 - - ");
        System.out.println("Reference - P and Instance - C");
        Parent obj2 = new Child();
        System.out.println(obj2.d);   /*there are 2 'd' one in p and other in c. so output will come according
                                        to reference type and here reference is of parent class*/
        System.out.println(obj2.d1);
        System.out.println(((Child)obj2).d); //if not found in 'c' then execute of 'p'
        System.out.println(((Child)obj2).d2);
        obj2.fun();        /* here case is opposite for function. it checks instance and run according to instance
                           first it will check in c class is there any fun() in c if exist then it
                           will execute fun() of c. if not then of p */
        obj2.fun1();      /* "((Child)obj2).fun1" this is also correct coz firstly it will check in 'c'
                             due to type casting if it is not found in 'c' then it will execute of 'p' */
        ((Child)obj2).fun2();


        System.out.println(" - - Case 3 - - ");
        System.out.println("Reference - C and Instance - P");
//        Child obj3 = new Parent();
//        System.out.println(obj3.d);
//        System.out.println(obj3.d1);
//        System.out.println(obj3.d2);
        // we cannot make child class as reference and parent class as instance. it is not allowed in java


        System.out.println(" - - Case 4 - - ");
        System.out.println("Reference - C and Instance - C");
        Child obj4 = new Child();
        System.out.println(obj4.d);
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        obj4.fun();
        obj4.fun1();
        obj4.fun2();
    }
}
