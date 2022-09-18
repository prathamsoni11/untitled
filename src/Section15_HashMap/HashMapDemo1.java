package Section15_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("USA",200);
        map.put("UK",175);
        map.put("India",300);
        map.put("China",350);
        System.out.println(map);

        map.put("Sweden",100);
        System.out.println(map);

        map.put("India",325);
        System.out.println(map);

        System.out.println(map.get("India"));
        System.out.println(map.get("RSA"));

        System.out.println(map.remove("USA"));
        System.out.println(map);

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("USA"));

        System.out.println("**********Keys**********");
        Set<String> keys = map.keySet();    // set did not give duplicate value
        for (String key: keys){       // so that why it does not support integer
            System.out.println(key);  // coz key can be different but values can be same
        }
        System.out.println("**********Values**********");
        Collection<Integer> values = map.values();    // collection can give duplicate value
        for (Integer value: values){
            System.out.println(value);
        }
        System.out.println("**********Values**********");
        Set<Map.Entry<String,Integer>> entries = map.entrySet();    // collection can give duplicate value
        for (Map.Entry<String,Integer> entry: entries){
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
