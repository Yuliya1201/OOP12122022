package com.javacource.Transport;
import static com.javacource.Transport.ValidateUtils.validateString;

public class Bus extends Transport {
    public Bus(String brand, String model, Integer year, String color, Integer maxSpeed, String country) {
        super(brand, model, year, color, country, maxSpeed);
    }

    public void refill(String fuel) {
        System.out.println("The bus will be refueled with " + validateRefillType(fuel));

    }
    public static String validateRefillType (String value) {
        if (validateString(value) && (value.equals("diesel") || value.equals("petrol"))) {
            return value;
        } else {
            return "diesel";
        }
    }
    public String toString() {
        return "Bus{" + "brend='" + getBrend() + '\''+", model='" + getModel() + '\''+ ", year=" +
                getYear() + ", country='" + getCountry() + '\'' + ", color='" + getColor() + '\'' +
                ", maxSpeed='" + getMaxSpeed() + '}';
    }
}
