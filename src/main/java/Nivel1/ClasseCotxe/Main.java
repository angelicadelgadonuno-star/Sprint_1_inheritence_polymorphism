package Nivel1.ClasseCotxe;

public class Main {
    static void main() {

        Car.brake();

        Car car = new Car (650);
        Car car1 = new Car(450);

        System.out.println(car.accelerate());

        System.out.println(Car.brake());

        Car.model = "Corolla";



    }
}
