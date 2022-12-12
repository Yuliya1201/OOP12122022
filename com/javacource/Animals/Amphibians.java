package com.javacource.Animals;

public final class Amphibians extends Animal {
    public Amphibians (String name,int age,String livingEnvironment) {
        super(name,age,livingEnvironment);
    }
    public void eat () {
        System.out.println("Питается насекомыми");
    }
    public void sleep () {
        System.out.println("Спит в воде");
    }
    public void go () {
        System.out.println("Перемещается по воде и по суше");
    }
    public void hunting() {
        System.out.println("Охотится на насекомых");
    }
}
