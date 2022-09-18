package Section14_Interface_Generics.Demo_Generics;

public class GenericsClient {
    public static void main(String[] args) {
        Integer[] arri = {10,20,30,40,50};
//        display(arri);
        String[] arrs = {"I","am","Pratham","Soni"};
//        display(arrs);

    }

    // we do not require to write same function for different data types
//    public static void display(Integer[] arr){
//        for (Integer val : arr){
//            System.out.print(val + " ");
//        }
//    }
//    public static void display(String[] arr){
//        for (String val : arr){
//            System.out.print(val + " ");
//        }
//    }

    public static <T> void display(T[] arr){     // here T = type. it refers to any type of data
        for (T val : arr){                       // it can take argument as of any type while calling function
            System.out.print(val + " ");       // in place of T we can use any alphabet in whole program
        }
        System.out.println();
    }

}
