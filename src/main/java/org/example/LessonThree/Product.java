package org.example.LessonThree;

import java.util.Date;

public class Product {
        String name;
        Date data;
        String countryFrom;
        String countryMade;
        double price;
        char order;
        public Product(String name, Date data, String countryFrom, String countryMade, double price, char order) {
            this.name = name;
            this.data = data;
            this.countryFrom = countryFrom;
            this.countryMade = countryMade;
            this.price = price;
            this.order = order;
        }

        public void printInfo() {
            System.out.println("название: " + name + "\n" +
                    "дата производства: " + data + "\n" +
                    "производитель: " + countryFrom + "\n" +
                    "страна происхождения: " + countryMade + "\n" +
                    "цена: " + price + "\n" +
                    "состояние бронирование покупателем: " + order);
        }
}