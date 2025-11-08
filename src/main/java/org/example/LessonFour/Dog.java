package org.example.LessonFour;

public class Dog extends Animal {
    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance <= MAX_RUN_DISTANCE && distance > 0) {
            System.out.println(name + "пробежал" + distance + "м");
        } else {
            System.out.println("Нереальная для собаки дистанция");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance <= MAX_SWIM_DISTANCE && distance > 0) {
            System.out.println(name + "проплыл" + distance + "м");
        } else {
            System.out.println("Не могу, у меня лапки");
        }
    }

    public static int getCount() {
        return count;
    }
}
