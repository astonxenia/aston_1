package org.example.LessonSeven;

public class ArithmeticOperations {
    public static double add(double a, double b) {
        return (a + b);
    }
    public static double subtract(double a, double b) {
        return (a - b);
    }
    public static double multiply(double a, double b) {
        return (a * b);
    }
    public static double division(double a, double  b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return (a / b);
    }
}
