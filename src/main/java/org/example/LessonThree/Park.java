package org.example.LessonThree;

import java.util.ArrayList;
import java.util.List;

public class Park {
    String name;
    List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public static class Attraction {
        String name;
        String time;
        double price;

        public Attraction(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + time);
            System.out.println("Цена: " + price);
        }
    }

    public void addAttraction(String name, String time, double price)  {
        Attraction attraction = new Attraction(name, time, price);
        attractions.add(attraction);
    }
}

