package org.example.BelajarClassObject;

public class BelajarClass {
    String color;
    String model;
    int year;

    public void drive(){
        System.out.println("The car is driving");
    }

    public void stopped(){
        System.out.println("The car is stopped");
    }

    public static void main(String[] args) {
        BelajarClass belajarClass = new BelajarClass();

        belajarClass.color = "Red";
        belajarClass.model = "4x4";
        belajarClass.year = 2025;

        System.out.println("The color of car is " + belajarClass.color);
        System.out.println("The model of car is " + belajarClass.model);
        System.out.println("The year of car is " + belajarClass.year);

        belajarClass.drive();

        belajarClass.stopped();

        BelajarClass belajarClass1 = new BelajarClass();
        belajarClass1.color = "Blue";

        System.out.println("The color of car 2 is " + belajarClass1.color);
    }
}
