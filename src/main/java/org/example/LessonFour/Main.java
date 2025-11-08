package org.example.LessonFour;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10, "Зеленый", "Оранжевый");
        Shape triangle = new Triangle(14, 15, 24, "Красный", "Синий");
        Shape rectangle = new Rectangle(34, 9, "Голубой", "Коричневый");

        Shape[] shapes = {circle, triangle, rectangle};
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println("Цвет фона: " + shape.getFillColour());
            System.out.println("Цвет границ: " + shape.getBorderColour());
            System.out.println("__________________________");
        }
    }
    }
