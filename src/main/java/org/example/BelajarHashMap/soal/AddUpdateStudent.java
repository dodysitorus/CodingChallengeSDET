package org.example.BelajarHashMap.soal;

import java.util.HashMap;
import java.util.Map;

public class AddUpdateStudent {
    public static void main(String[] args) {
        Map<String, String> student = new HashMap<>();
        student.put("NIS 12345", "Jhon Doe");
        student.put("NIS 67890", "Jane Smith");
        for (Map.Entry<String, String> entry : student.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        student.replace("NIS 12345", "Jonathan Doe");
        for (Map.Entry<String, String> entry : student.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
