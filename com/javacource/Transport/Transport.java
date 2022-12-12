package com.javacource.Transport;
import static com.javacource.Transport.ValidateUtils.validateString;
public abstract class Transport {
    public String brend;
    public String model;
    private final Integer year;
    private final String country;
    private String color;
    public Integer maxSpeed;
    private String fuel;

    public Transport(String brend, String model, Integer year, String country, String color, int maxSpeed) {
        if (brend.isEmpty() && brend == null && brend.isBlank()) {
            this.brend = "инф-я не корректна";
        } else {
            this.brend = validateCarParameters(brend);
        }
        if (model.isEmpty() && model == null && model.isBlank()) {
            this.model = "инф-я не корректна";
        } else {
            this.model = validateCarParameters(model);
        }
        if (color.isEmpty() && color == null && model.isBlank()) {
            this.color = "цвет не указан";
        } else {
            this.color = validateColor(color);
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.year = validateYear(year);
        this.country = validateCountry(country);
    }


    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указан" : value;
    }

    public static int validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateCountry(String value) {
        return validateString(value, "Rus");
    }

    public static String validateColor(String value) {
        return validateString(value, "автомат");
    }

    public static String validateTransmission(String value) {
        return validateString(value, "автомат");
    }

    abstract void refill(String fuel);

    public String toString() {
        return "Transport{" + "brend='" + brend + '\'' + ",model='" + model + '\'' + ",year=" + year +
                ",country='" + country + '\'' + ",color='" + color + '\'' + ",maxSpeed=" + maxSpeed + '}';
    }
}


