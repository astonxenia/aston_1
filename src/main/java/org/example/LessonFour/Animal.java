package org.example.LessonFour;

 public abstract class Animal {
    String name;
    protected static int count = 0;

    public Animal (String name) {
        this.name = name;
        count++;
    }

    public void animalInfo() {
        System.out.println("Кличка животного: " + name);
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

     public static int getCount() {
         return count;
     }
 }