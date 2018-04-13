package factory;

/**
 * sell the car to newOwner
 */


public class Main {

    public static void main(String[] args) {
        //with constructor call
        Car myCar = new Car("Toyota","Aygo",2011,true,40000,"Adam");

        myCar.isOld();
        myCar.sell("Lukas");
    }

}