package com.javacource.Animals;

public class NoFlying extends Bird {
    public NoFlying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }

    public void walk() {
        System.out.println("передвигается на лапах");
    }
    public void eat () {
        System.out.println("питается насекомыми");
    }
    public void sleep () {
        System.out.println("спит в гнезде");
    }
    public void go () {
        System.out.println("перемещается по земле");
    }

    @Override
    public void hunting() {
        System.out.println("охотится на насекомых");
    }

    @Override
    public String toString() {
        return "NoFlying{" +"name='" + getName() + '\''+ ", age=" + getAge() + ", livingEnvironment='" +
                getLivingEnvironment() + '\'' + ",typeArea='" + getTypeArea() + '\'' + '}';
    }
}
