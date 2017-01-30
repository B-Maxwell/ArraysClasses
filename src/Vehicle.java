/**
 * Created by Ben Maxwell on 1/30/17.
 * This class tracks various aspects of vehicle information
 *
 */
public class Vehicle {

    String make;
    String model;
    int year;
    String type; //i.e. sedan, truck, SUV, and etc.
    String color;
    int numPass; //number of passengers
    double price; //current price of vehicle

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.make = "Honda";
        v1.model = "Accord";
        v1.year = 2015;
        v1.type = "Sedan";
        v1.color = "Blue";
        v1.numPass = 5;
        v1.price = 19000;

        System.out.println("Make:\t" + v1.make + "\nModel:\t" + v1.model + "\nYear:\t" + v1.year + "\nType:\t" + v1.type +
                "\nColor:\t" + v1.color + "\nCapacity:\t" + v1.numPass + " Passengers" + "\nPrice:\t" + v1.price);
    }

}
