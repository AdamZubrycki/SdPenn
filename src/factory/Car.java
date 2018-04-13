package factory;

import java.util.Calendar;

public class Car {
    //instance variables - private after constructor use (released)
    private String make;
    private String model;
    private int year;
    private boolean isNew = true;
    private double miles;
    private String owner;

    //constructor
    public Car(String make, String model, int year, boolean isNew, double miles, String owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isNew = isNew;
        this.miles = miles;
        this.owner = owner;
    }

    public void sell(String NewOwner) {
        owner = NewOwner;
        if (isNew) {
            isNew = false;
        }
    }

    public boolean isOld() {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR); //current year
        if (thisYear - year > 10) {
            System.out.println(owner+ ", your car is old.");
            return true;
        } else {
            System.out.println(owner+ ", your car is: "+(thisYear-year)+" years old");
            return false;
        }
    }
}