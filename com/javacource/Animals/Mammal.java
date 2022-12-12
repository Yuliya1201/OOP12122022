package com.javacource.Animals;

public abstract class Mammal extends Animal {
    private final int movementSpeed;
    private String food;
    private String livingEnvironment;

    public Mammal(String name,int age,String livingEnvironment,int movementSpeed,String food) {
        super(name,age,livingEnvironment);
        this.movementSpeed = validateInteger(movementSpeed,1);
        this.food = validateString(food,"молоко");
        this.livingEnvironment = getLivingEnvironment();
    }

    @Override
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMovementSpeed () {
        return movementSpeed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = validateString(food,"молоко");
    }
    public abstract void walk();
}
