package org.example;

import java.util.Scanner;

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
    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return  sum >= 10 && sum <= 20;
    }
    public static void  checkNumberSign(int x) {
        System.out.println(x < 0 ? "Отрицательное" : "Положительное");
    }
    public static boolean returnNegativeNumber(int c) {
        return c < 0;
    }
    public static void printRepeatedString(String text, int time) {
        for(int i  =  0; i < time; i++) {
            System.out.println(text);
        }
    }

    public static void main(String [] args) {
        checkSumSign();
        printColor();
        compareNumbers();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b  = scanner.nextInt();
        boolean result = checkSumRange(a,b);
        System.out.println(result);
        int x = scanner.nextInt();
        checkNumberSign(x);
        int c = scanner.nextInt();
        System.out.println(returnNegativeNumber(c));
        scanner.nextLine();
        String text = scanner.nextLine();
        int time = scanner.nextInt();
        printRepeatedString(text, time);
    }
}