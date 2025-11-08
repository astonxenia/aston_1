package org.example.LessonFour;

public interface Shape {
    double getArea();
    default double getPerimeter() {
        return 0;}
    String getBorderColour();
    String getFillColour();
}