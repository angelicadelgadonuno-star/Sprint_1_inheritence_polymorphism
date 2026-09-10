package Nivel1.ClasseCotxe;

public class Main {
    static void main() {

        Car.brake();

        Car car = new Car ( "Volvo", "EX360", 680 );

        car.accelerate();

        System.out.println(Car.brake());

        System.out.println(Car.brand);
        System.out.println(Car.model);
        System.out.println(Car.power);
    }
}
