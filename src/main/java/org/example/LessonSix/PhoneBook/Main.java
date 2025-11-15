package org.example.LessonSix.PhoneBook;

import org.example.LessonSix.PhoneBook.PhoneBook;

public class Main {
    public static void main(String [] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Иванов", "123-23-12");
        pb.add("Петров", "223-23-62");
        pb.add("Сидоров", "333-53-12");
        pb.add("Васильев", "663-83-56");
        pb.add("Лапочкин", "987-23-00");
        pb.add("Иванов", "678-90-43");

        System.out.println("Иванов – Телефоны: " + pb.get("Иванов"));
        System.out.println("Петров – Телефоны: " + pb.get("Петров"));
        System.out.println("Сидоров – Телефоны: " + pb.get("Сидоров"));
        System.out.println("Васильев – Телефоны: " + pb.get("Васильев"));
        System.out.println("Лапочкин – Телефоны: " + pb.get("Лапочкин"));
    }
}
