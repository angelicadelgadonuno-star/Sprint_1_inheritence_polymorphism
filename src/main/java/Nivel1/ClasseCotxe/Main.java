package Nivel1.ClasseCotxe;

public class Main {
    static void main() {

        Car.brake();

        Car car = new Car (650);
        Car car1 = new Car(450);

        System.out.println(car.accelerate());

        System.out.println(car1.brake());

        Car.model = " Corolla ";

        System.out.println("The model of the car is " + Car.model);
        System.out.println("The brand of the car is " + Car.BRAND);

    }
}
