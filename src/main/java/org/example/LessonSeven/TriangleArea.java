package org.example.LessonSeven;

public class TriangleArea {
    public static double triangleArea(int sideA, int sideB, int sideC) {
        if(sideA <= 0  || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Длины сторон должны быть больше 0");
        }
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            throw new IllegalArgumentException("Таких треугольников не существует");
        }
        double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return Math.round(area * 10000.0) / 10000.0;
    }
}
