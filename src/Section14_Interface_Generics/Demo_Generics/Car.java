package Section14_Interface_Generics.Demo_Generics;


import java.util.Comparator;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String color;

    public Car(int speed , int price , String color){
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {         // this is replace of "print" in System.out.print
        return "speed=" + speed + ", price=" + price + ", color=" + color;
    }

    @Override
    public int compareTo(Car other) {
        return this.speed - other.speed;
//        return other.price - this.price;
//        return this.color.compareTo(other.color);   // this compareTo is of String
    }

    public static <T> void display(T[] arr){
        for (T val : arr){
            System.out.print(val);
            System.out.println();
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        for(int counter = 0 ; counter<arr.length-1 ; counter++){
            for(int j = 0 ; j<arr.length-1-counter ; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr , Comparator<T> comparator){
        for(int counter = 0 ; counter<arr.length-1 ; counter++){
            for(int j = 0 ; j<arr.length-1-counter ; j++){
                if(comparator.compare(arr[j] , arr[j+1]) > 0 ){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(1000,100,"Red");
        cars[1] = new Car(2000,200,"Yellow");
        cars[2] = new Car(3000,300,"White");
        cars[3] = new Car(4000,400,"Grey");
        cars[4] = new Car(5000,500,"Black");

        //bubbleSort(cars);

//        bubbleSort(cars,new CarSpeedComparator());
//        display(cars);
//
//        bubbleSort(cars,new CarPriceComparator());
//        display(cars);

        bubbleSort(cars,new CarColorComparator());
        display(cars);
    }

}
