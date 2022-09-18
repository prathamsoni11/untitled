package Section10_OOPS_Stacks;

public class StudentClient {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[1000];
        for(int i = 0 ; i < students.length ; i++){
            students[i] = new Student(i+"th");
            System.out.println(Student.getNumOfStudents());
        }

        // Able to access static field but can't change the value
        // Student.MAX_STUDENTS = 2000;

        // throws error due to final and can't change the value
        // students[250].rollNo = 10;

        System.out.println(students[250].rollNo);
        System.out.println(students[250].getName());
        students[250].setName("ABC");
        System.out.println(students[250].getName());

        students[250].ANonStaticFunction();
        students[250].AStaticFunction();
        Student.AStaticFunction();

        students[250].setUniformColor("Blue");
        System.out.println(students[350].getUniformColor());

    }
}
