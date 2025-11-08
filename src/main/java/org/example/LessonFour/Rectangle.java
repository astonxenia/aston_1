package org.example.LessonFour;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColour;
    private String borderColour;

    public Rectangle(double width, double height, String fillColour, String borderColour) {
        this.width = width;
        this.height = height;
        this.fillColour = fillColour;
        this.borderColour = borderColour;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
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
