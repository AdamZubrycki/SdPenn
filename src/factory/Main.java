package factory;

/**
 * sell the car to newOwner
 */


public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.make = "Toyota";
        myCar.model = "Aygo";
        myCar.year = 2011;
        myCar.isNew=true;
        myCar.miles=40000;
        myCar.owner="Adam";
        myCar.isOld();
        myCar.sell("Lukas");
    }

}