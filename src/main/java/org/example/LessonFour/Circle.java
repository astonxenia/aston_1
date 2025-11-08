package org.example.LessonFour;


public class Circle implements Shape {
    private double radius;
    private String fillColour;
    private String borderColour;

    public Circle(double radius, String fillColour, String borderColour) {
        this.radius = radius;
        this.fillColour = fillColour;
        this.borderColour = borderColour;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
