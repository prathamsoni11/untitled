package Section15_HashMap;

public class client {
    public static void main(String[] args) throws Exception{
        HashTable<String,Integer> map = new HashTable<>(4);
        map.put("USA",200);
        map.put("UK",175);
        map.put("India",300);
        map.display();

        System.out.println("****************************");
        map.put("China",350);
        map.display();
//        map.put("Sweden",100);
//        map.put("Nepal",50);
//        map.display();
//        System.out.println("****************************");
//        map.put("Ireland",75);
//        map.display();

//        System.out.println("****************************");
//        System.out.println(map.get("India"));
//        System.out.println(map.get("RSA"));
//
//        System.out.println("****************************");
//        System.out.println(map.remove("India"));
//        System.out.println(map.remove("RSA"));
    }

}
