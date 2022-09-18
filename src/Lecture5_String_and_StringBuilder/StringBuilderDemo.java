package Lecture5_String_and_StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println("********************");
        System.out.println("append()");
        sb.append("abc");
        System.out.println(sb);

        System.out.println("********************");
        System.out.println("insert()");
        sb.insert(2,"def");
        System.out.println(sb);
        sb.insert(6,'g');
        System.out.println(sb);
        sb.insert(sb.length(),'h');
        System.out.println(sb);

        System.out.println("********************");
        System.out.println("delete()");
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);

        System.out.println("********************");
        System.out.println("setCharAt()");
        sb.setCharAt(sb.length()-1,'h');
        System.out.println(sb);

        System.out.println("********************");
        System.out.println("Convert string builder to string");
        String str1 = sb.toString();
        System.out.println(str1);

        System.out.println("********************");
        System.out.println("Taking user input in string builder");
        Scanner scn = new Scanner(System.in);
        String str2 = scn.nextLine();
        StringBuilder sb2 = new StringBuilder(str2);
        System.out.println(sb2);

    }
}
