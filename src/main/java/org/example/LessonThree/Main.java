package org.example.LessonThree;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray  = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new  Product("Apple Watch Series 9", "15.09.2025",
                "Apple Inc.", "USA", 4500, false);
        productsArray[2] = new Product("Apple iPhone 15", "15.09.2025",
                "Apple Inc.", "USA", 6999, true);
        productsArray[3] = new Product("Sony Xperia 5 IV", "20.07.2025",
                "Sony", "Japan", 3999, true);
        productsArray[4] = new  Product("Google Pixel 10", "01.10.2025",
                "Google LLC", "USA", 4999, false);

    }
}
