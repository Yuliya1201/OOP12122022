package com.javacource.Transport;
import static com.javacource.Transport.ValidateUtils.validateString;


import java.security.Key;

public class Car extends Transport {
    private final String bodyType;
    private boolean isSummerRubber;
    private String transmission;
    private String number;
    private final int seatCount;
    private double enginePower;

    private Key key;
    private Insurance insurance;
    public class Insurance { }
    public class Key { }


    public Car (String brend, String model, Integer year, String color, String country, String bodyType, Integer maxSpeed,
                double enginePower, boolean isSummerRubber, String transmission, String number, int seatCount,
                String bodyType1, boolean isSummerRubber1, String transmission1, String number1, int seatCount1) {
        super(brend, model, year, color, country, maxSpeed);
        this.bodyType = bodyType1;
        this.isSummerRubber = isSummerRubber1;
        this.transmission = transmission1;
        this.number = number1;
        this.seatCount = seatCount1;
    }

    @Override
    public void refill(String fuel) {
        System.out.println("The car will be refueled with"+ validateRefillType(fuel));
    }
    public static String validateRefillType (String value) {
        if (validateString(value) && (value.equals("diesel") || value.equals("petrol"))) {
            return value;
        } else {
            return "petrol";
        }
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public int getSeatCount() {
        return seatCount;
    }
    public static String validateBodyType (String value,String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;

    }

    public String getBodyType() {
        return bodyType;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}



