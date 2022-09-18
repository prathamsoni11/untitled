package Section10_OOPS_Stacks;

public class Student {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) throws Exception{
        if(name.equals("") || name == null){
            throw new Exception("Name can't be null or empty");
        }
        this.name = name;
    }


    // final means value can be set only once. Can be public
    public final int rollNo;


    // static means, it belong to the class (it is not copied in each object)
    private static int NumOfStudents = 0;
    public static int getNumOfStudents() {

        return Student.NumOfStudents;
    }


    public static final int MAX_STUDENTS = 1000;


    private static String UniformColor = "White";
    public static String getUniformColor(){
        return Student.UniformColor;
    }
    public static void setUniformColor(String uniformColor){
        Student.UniformColor = uniformColor;
    }


    public Student(String name) throws Exception{
        if(Student.NumOfStudents == Student.MAX_STUDENTS){
            throw new Exception("Max Limit reached");
        }
        this.setName(name);

        Student.NumOfStudents++;
        this.rollNo = Student.NumOfStudents;
    }

    
    // can access both static and non-static data members
    public void ANonStaticFunction(){
        System.out.println(this.name + " says hello to " + Student.NumOfStudents + " students");
    }
    // can access only static data members
    // can't use this
    // can't use non-static data member
    // No need to create object, can be called directly via class name.
    public static void AStaticFunction(){
        System.out.println(Student.NumOfStudents + " out of possible " + Student.MAX_STUDENTS);
    }
}
