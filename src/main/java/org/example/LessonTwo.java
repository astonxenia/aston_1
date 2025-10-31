package org.example;

public class LessonTwo {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 3;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0  && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void  compareNumbers() {
        int a = 2;
        int b = 8;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static void main(String [] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}