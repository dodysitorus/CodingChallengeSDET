package org.example;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "!@#$%^&*() latin string 0123456789";
        System.out.println(removeJunk(s));
    }

    public static String removeJunk(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return new String(s);
    }
}
