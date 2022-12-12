package com.javacource.Animals;

public class Flying extends Bird{
    public Flying (String name,int age, String livingEnvironment,String typeMovement) {
        super(name,age,livingEnvironment,typeMovement);
    }

    @Override
    public void hunting() {
        System.out.println("Охотятся на мелких животных");
    }
    public void eat () {
        System.out.println("питается мелкими животными");
    }
    public void sleep() {
        System.out.println("спит в гнезде");
    }
    public void go() {
        System.out.println(",летает");
    }
    public void toFly() {
        System.out.println("Летающая птица");
    }

    @Override
    public String toString() {
        return "Flying{" + "name=" + getName() + '\'' + ", age=" + getAge() + ", livingEnvironment='" +
                getLivingEnvironment() + '\'' + ", typeArea='" + getTypeArea() + '\'' + "} " + super.toString();
    }
}
