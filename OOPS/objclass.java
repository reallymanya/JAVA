package OOPS;


class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;
    public String name;

    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }
}

public class objclass {
    public static void main(String[] args) {
        // object = an instance of a class that may
        // contain attributes and methods
        // example: (phone, desk, computer, coffee cup)
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        
        System.out.println();
        
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

    }
}
