package org.example.LessonFour;

public class Cat extends Animal {
    private final int MAX_RUN_DISTANCE = 200;
    private static int count = 0;
    boolean isFull = false;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance <= MAX_RUN_DISTANCE && distance > 0) {
            System.out.println(name + "пробежал" + distance + "м.");
        } else {
            System.out.println("Не мучай животное, максимальная дистанция" + MAX_RUN_DISTANCE + "м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + "не умеет плавать!");
    }

    public static int getCount() {
        return count;
    }

    public void eat(Bowl bowl, int amount) {
        if(bowl.hasEnoughFood(amount)) {
            bowl.takeAwayFood(amount);
            isFull = true;
            System.out.println(name + "сыт");
        } else {
            System.out.println("еды не хватило");
        }
    }
}