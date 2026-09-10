package Nivel1.ClasseCotxe;

public class Car {

    static final String brand = "Volvo";
    static String model =  "EX60";
    static final int power = 680;

    public Car(String brand, String model, int power) {
    }

    public static String brake(){
        return "The Car is braking";
    }
    public String accelerate(){
        return "The car is accelerating";
    }


}
