package org.example.LessonFive;

public class Main {

    public static int myArray(String [][] array) {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк, должно быть 4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов должно быть 4");
            }
        }
        System.out.println("Размер массива 4Х4");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "]" + "[" + j + "]" );
                }
            }
        }
        return sum;
    }

    public static void main(String[] args){
        String [][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };
        try {
            int result = myArray(array);
            System.out.print("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: "  + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка преобразования массива: " + e.getMessage());
        }
    }
}
