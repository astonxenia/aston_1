package org.example.LessonFour;

public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColour;
    private String borderColour;

    public Triangle(double sideA, double sideB, double sideC, String fillColour, String borderColour) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColour = fillColour;
        this.borderColour = borderColour;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String getFillColour() {
        return fillColour;
    }

    @Override
    public String getBorderColour() {
        return borderColour;
    }
}
