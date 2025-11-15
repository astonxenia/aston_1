package org.example.LessonFive;

public class Main {
    public static void myArray(String [][] array) {
        if(array.length  != 4) {
            throw new MyArraySizeException("Неверное количество строк, должно быть 4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов должно быть 4");
            }
        }
        System.out.println("Размер массива 4Х4");
    }
}
