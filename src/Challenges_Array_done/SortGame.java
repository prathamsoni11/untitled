package Challenges_Array_done;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class SortGame {

    public static class Student {
        String name;
        Integer score;

        Student(String name, Integer score) {
            this.name = name;
            this.score = score;
        }
    }

    public static class SortByScore implements Comparator<Student> {
        /*
        Algorithm:
        1. If score are not same: just return the high score [put high score student first]
        2. If score is same:
            a. If name are different, return in lexicographical order.
            b. If name same, .i.e one name is sub-string of other name, return the longer name first.
        */
        @Override
        public int compare(Student student1, Student student2) {
            if (student1.score.equals(student2.score)) {
                if (student1.name.contains(student2.name) || student2.name.contains(student1.name)) {
                    return student2.name.compareTo(student1.name);
                }
                return student1.name.compareTo(student2.name);
            }
            return student2.score - student1.score;
        }
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int minScore = scanner.nextInt();
        int noOfStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        while (noOfStudents-- >0) {
            String name = scanner.next();
            Integer score = scanner.nextInt();
            Student student = new Student(name, score);
            students.add(student);
        }

        students.sort(new SortByScore());

        for (Student student : students) {
            if (student.score >= minScore) {
                System.out.print(student.name + " ");
                System.out.println(student.score);
            }
        }
    }
}
