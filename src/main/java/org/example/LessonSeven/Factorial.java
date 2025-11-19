package org.example.LessonSeven;

public class Factorial {
        public static long calculateFactorial (int number){
            if(number < 0)  {
                throw new IllegalArgumentException("Число должно быть положительным");
            }
            long result = 1;
            for (int i = 2; i <= number; i++)  {
                result *= i;
            }
            return (long) result;
        }
    }
