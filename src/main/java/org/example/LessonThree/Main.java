package org.example.LessonThree;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Product product = new Product("Масло", new Date(), "Россия",
            "Беларусь", 250.50, 'N');
    product.printInfo();
    }
}
