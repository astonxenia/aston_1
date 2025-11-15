package org.example.LessonSix.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentsSorting sorting = new StudentsSorting();

        Student student1 = new Student("Василий", "Группа 1", 1, Arrays.asList(4, 5, 3));
        Student student2 = new Student("Иван", "Группа 2", 1, Arrays.asList(3, 2, 3));
        Student student3 = new Student("Мария", "Группа 1", 3, Arrays.asList(3, 3, 3));
        Student student4 = new Student("Даниил", "Группа 3", 2, Arrays.asList(3, 4, 3));
        Student student5 = new Student("Иван", "Группа 2", 1, Arrays.asList(5, 5, 5));
        Student student6 = new Student("Наталья", "Группа 1", 3, Arrays.asList(5, 3, 3));
        Student student7 = new Student("Лука", "Группа 3", 1, Arrays.asList(4, 2, 2));
        Student student8 = new Student("Людмила", "Группа 1", 2, Arrays.asList(5, 5, 3));

        sorting.addStudent(student1);
        sorting.addStudent(student2);
        sorting.addStudent(student3);
        sorting.addStudent(student4);
        sorting.addStudent(student5);
        sorting.addStudent(student6);
        sorting.addStudent(student7);
        sorting.addStudent(student8);

        sorting.printStudents(1);

        sorting.deleteLowScoringStudents();

        sorting.toNextCourse();

        sorting.printStudents(2);
    }
}
