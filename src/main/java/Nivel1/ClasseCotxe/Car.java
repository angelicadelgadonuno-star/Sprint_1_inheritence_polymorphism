package Nivel1.ClasseCotxe;

public class Car {

    public static final String BRAND = "Volvo";
    public static String model = "EX360";
    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public static String brake(){
        return "The Car is br1aking";
    }
    public String accelerate(){
        return "The car is accelerating";
    }

}
