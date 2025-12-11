package org.example.BelajarHashMap;

import java.util.HashMap;
import java.util.Map;

public class Belajar {
    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("satu", 1);
        maps.put("dua", 2);
        maps.put("dua", 2);
        maps.put("tiga", 3);

        System.out.println(maps);

        System.out.println(maps.get("satu"));

        maps.remove("tiga");

        System.out.println(maps);

        for (String i : maps.keySet()){
            System.out.println(i);
        }

        for (Integer i : maps.values()){
            System.out.println(i);
        }

        for (Map.Entry<String, Integer> entry : maps.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}
