package org.example.LessonFour;

public class Bowl {
    int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public boolean hasEnoughFood(int amount) {
        return foodAmount >= amount;
    }

    public void takeAwayFood(int amount) {
        if(hasEnoughFood(amount)) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if(amount > 0) {
            foodAmount += amount;
        }
    }
}
