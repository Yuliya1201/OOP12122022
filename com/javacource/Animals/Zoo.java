package com.javacource.Animals;

public class Zoo {
    public static void main(String[] args) {
        Herbivore rabbit = new Herbivore("rabbit",5,"forest",50,"grass");
        Herbivore elefant = new Herbivore("elefant",2,"tropics",55,"grass");
        System.out.println(rabbit);
        rabbit.eat();
        rabbit.go();
        rabbit.pastiche();
        rabbit.sleep();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj== null || getClass() != obj.getClass())
        return super.equals(obj);
        return false;
    }
}
