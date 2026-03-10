package org.example.BelajarStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoUsedSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        List<WebElement> listWebElement = driver.findElements(By.xpath("//div[@id ='content']//a"));
        List<String> listText = new ArrayList<>();
        List<String> listF = new ArrayList<>();

        for (int i = 0; i < listWebElement.size(); i++) {
            listText.add(listWebElement.get(i).getText());
        }

        for (int i = 0; i < listText.size(); i++) {
            if (listText.get(i).startsWith("F")) {
                listF.add(listText.get(i));
            }
        }

        int max = 0;
        int index = -1;

        for (int i = 0; i < listF.size(); i++) {
            String x = listF.get(i);
            int countX = x.length();
            if (countX > max) {
                max = countX;
                index = i;
            }
        }
        System.out.println("Longest link starting with F is " + listF.get(index));

//        Using Stream
        String longestString = listWebElement.stream().
                map(e -> e.getText()).
                filter(s -> s.startsWith("F")).
                max(Comparator.comparingInt(s -> s.length())).
                orElse("Not Found");

        System.out.println(longestString);

        driver.quit();
    }
}
