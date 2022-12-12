package com.javacource.Animals;

public class Predator extends Mammal{
    public Predator(String name,int age,String livingEnvironment,int movementSpeed,String food) {
        super(name,age,livingEnvironment,movementSpeed,food);
    }
    public void walk() {
        System.out.println("не очень любит");
    }
    public void eat() {
        System.out.println("ест: " + getFood());
    }
    public void sleep() {
        System.out.println("спит в пещере");
    }
    public void go() {
        System.out.println("перемещается шагом и бегом");
    }
    public void hunting() {
        System.out.println("охотится на других животных");
    }

    @Override
    public String toString() {
    return "Predator{" + "name='" + getName() + '\'' + ", age=" + getAge() + ", livingEnvironment='" +
            getLivingEnvironment() + '\'' + ", movementSpeed=" + getMovementSpeed() + '\'' + ", food'" +
            getFood() + '\'' + '}';
    }
}