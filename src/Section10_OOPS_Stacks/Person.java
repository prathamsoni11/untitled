package Section10_OOPS_Stacks;

public class Person {
//    String name;    // This is Default access specifiers
//    int age;
    public Person(){                                              //this the constructor
        System.out.println("I am the default constructor ");      //the constructor is same as class name
    }                           /* if we do not write this constructor then there is a default constructor in
                                java that will executed for p1 and p2 */

                                /* Note:- but for p3 it will show error because of the parameter */

    public Person(int age){
        System.out.println("I am parameterised constructor with one parameter");
        this.age = age;
    }
    // This is also also correct form if variable name are different
    // it is not necessary to use this. if variable name are different
/*    public Person(int myage){
        System.out.println("I am parameterised constructor with one parameter");
        age = myage;
    }
 */

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
