package com.javacource.Animals;


public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    protected Animal(String name,int age,String livingEnvironment) {
        this.name = validateString(name,"any name");
        this.age = validateInteger(age,1);
        this.livingEnvironment = livingEnvironment;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
    public static String validateString(String value,String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (obj == null || getClass()!= obj.getClass())
        return false;
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static Integer validateInteger (Integer value, Integer substitution) {
        return (value == null || value <= 0 ) ? substitution : value;
    }
    abstract void eat();
    abstract void sleep();
    abstract void go();
}
