package org.example.LessonSeven;

public class ArithmeticOperations {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static double multiply(int a, int b) {
        return a * b;
    }
    public static double division(int a, int  b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return (double) a / b;
    }
}
