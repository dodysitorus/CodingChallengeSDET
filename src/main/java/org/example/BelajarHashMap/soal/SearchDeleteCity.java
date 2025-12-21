package org.example.BelajarHashMap.soal;

import java.util.HashMap;
import java.util.Map;

public class SearchDeleteCity {
    public static void main(String[] args) {
        Map<String, Integer> city = new HashMap<>();
        city.put("Jakarta",10000000);
        city.put("Bandung",2500000);
        city.put("Surabaya",5000000);
        city.put("Yogyakarta",10000000);
        System.out.println(searchCity(city, "Yogyakarta"));
        System.out.println(deleteCity(city, "Yogyakarta"));
        System.out.println(city);
    }

    public static Integer searchCity(Map<String, Integer> city, String querySearch){
        Integer result =  city.get(querySearch);
        return result;
    }

    public static String deleteCity(Map<String, Integer> city, String querySearch){
        city.remove(querySearch);
        return "Menghapus " + querySearch;
    }
}
