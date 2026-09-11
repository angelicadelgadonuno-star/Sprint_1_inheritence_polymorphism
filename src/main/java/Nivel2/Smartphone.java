package Nivel2;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("A photo is being taken ");
    }
    @Override
    public void alarmSounding () {
        System.out.println("An Alarm is sounding ");

    }

}