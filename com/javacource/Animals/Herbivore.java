package com.javacource.Animals;

public class Herbivore extends Mammal {
    public Herbivore(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    public void eat() {
        System.out.println("ест: " + getFood());
    }

    public void sleep() {
        System.out.println("спит на земле.");
    }

    public void go() {
        System.out.println("перемещается по земле");
    }

    public void walk() {
        System.out.println("гуляет");
    }

    public void pastiche() {
        System.out.println("пасется");
    }

    @Override
    public String toString() {
        return "Herbivore{" + "name='" + getName() + '\'' + ", age=" + getAge() +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' + ", movementSpeed=" +
                getMovementSpeed() + ", food='" + getFood() + '\'' + '}';
    }
}
