package org.example.LessonThree;

public class Park {
    String name;

    public Park(String name) {
        this.name = name;
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
            System.out.println("Аттракцион" + name);
            System.out.println("Время работы" + time);
            System.out.println("Цена" + price);
        }
    }
}

