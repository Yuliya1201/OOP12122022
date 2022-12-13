package com.javacource.Transport;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "желтого цвета", "российская",
                "легковая", 200, 1,true, "перевозить людей",
                "В443АО123",4,"легковая",true,"перевозить людей",
                "А443ВО123",4);
        System.out.println(lada);;
        lada.getBodyType();
        lada.getEnginePower();
        lada.getSeatCount();
        lada.getBrend();
        lada.getColor();
        lada.getCountry();
        lada.toString();
        lada.getYear();

    }
}

