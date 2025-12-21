package org.example.BelajarHashMap;



import java.util.HashMap;
import java.util.Map;

public class BelajarMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 2);

        System.out.println("Apple: "+ map.get("apple"));
        System.out.println("Contains 'banana': " + map.containsKey("banana"));
        System.out.println("Contains 'grape': " + map.containsKey("grape"));
        System.out.println("Contains value 2: " + map.containsValue(2));
        System.out.println("Contains value 2: " + map.containsValue(4));

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue() > 3){
                System.out.println("Buah terbanyak adalah " + entry.getKey() + " sebanyak " + entry.getValue());
            }
        }

    }
}
