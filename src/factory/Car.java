package factory;

import java.util.Calendar;

public class Car {
    //instance variables
    String make;
    String model;
    int year;
    boolean isNew = true;
    double miles;
    String owner;

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
