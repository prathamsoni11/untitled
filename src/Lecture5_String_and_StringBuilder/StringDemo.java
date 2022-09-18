package Lecture5_String_and_StringBuilder;

public class StringDemo {
    public static void main(String[] args) {
        //Part1
        String str = "hello";
        // Part2
        System.out.println("********************");
        System.out.println("charAt(index)");
        System.out.println(str.charAt(0));
        System.out.println(str.length()-1);
        // Part3
        System.out.println("********************");
        System.out.println("substring()");
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(3,3));
        System.out.println(str.substring(0,str.length()));
        System.out.println(str.substring(2));
        // Part4
        System.out.println("********************");
        System.out.println("concat()");
        String s1 = "Hi";
        String s2 = "bye";
        String s3 = s1+s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);
        // Part 5
        System.out.println("********************");
        System.out.println("indexOf");
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("El"));
        // Part 6
        System.out.println("********************");
        System.out.println("startsWith()");
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("He"));
        // Part 7
        System.out.println("********************");
        System.out.println("equals()");
        String s11 = "Hello";
        String s12 = "Hello";
        String s13 = new String("Hello");
        System.out.println(s1 == s12);   // Addresses  4k == 4k
        System.out.println(s1 == s13);   // 4k == 5k
        System.out.println(s11.equals(s13));   //character by character

        System.out.println("********************");


    }
}
