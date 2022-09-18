package Section16_Heap;

import Section14_Interface_Generics.Demo_Generics.Car;

public class HeapGenericClient {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car(1000,100,"Red");
        cars[1] = new Car(2000,200,"Yellow");
        cars[2] = new Car(3000,300,"White");
        cars[3] = new Car(4000,400,"Grey");
        cars[4] = new Car(5000,500,"Black");

        HeapGeneric<Car> heapg = new HeapGeneric<>();
        heapg.add(cars[0]);
        heapg.add(cars[1]);
        heapg.add(cars[2]);
        heapg.add(cars[3]);
        heapg.add(cars[4]);

        System.out.println(heapg.remove());
    }
}
