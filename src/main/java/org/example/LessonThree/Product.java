package org.example.LessonThree;

public class Product {
        String name;
        String data;
        String countryFrom;
        String countryMade;
        double price;
        boolean order;
        public Product(String name, String data, String countryFrom, String countryMade, double price, boolean order) {
            this.name = name;
            this.data = data;
            this.countryFrom = countryFrom;
            this.countryMade = countryMade;
            this.price = price;
            this.order = order;
        }

        public void printInfo() {
            System.out.println("название: " + name +
                    "дата производства: " + data +
                    "производитель: " + countryFrom +
                    "страна происхождения: " + countryMade +
                    "цена: " + price +
                    "состояние бронирование покупателем: " + order);
        }
}