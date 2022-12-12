package com.javacource.Transport;
import static com.javacource.Transport.ValidateUtils.*;

public class Train  extends Transport {
    private Integer travelTime;
    private String departure;
    private String destination;
    private Integer wagonsCount;

    public  Train(String brand,String model,Integer year,String country,String color,Integer travelTime,
                 String departure,String destination,Integer wagonsCount,Integer maxSpeed) {
        super(brand,model,year,country,color,maxSpeed);

        this.travelTime = validateInteger(travelTime,60);
        this.departure = validateString(departure,"any station");
        this.destination = validateString(destination,"any station");
        this.wagonsCount = validateInteger(wagonsCount,2);
    }

    @Override
    public void refill(String fuel) {
        System.out.println("The train will be refueled with " + validateRefillType(fuel));
    }
    public static String validateRefillType (String value) {
        if (validateString(value) && (value.equals("diesel") || value.equals("petrol"))) {
            return value;
        } else {
            return "diesel";
        }
    }
}