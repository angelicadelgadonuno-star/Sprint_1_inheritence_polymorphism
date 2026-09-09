package Nivel1.InstrumentosMusicales;

abstract class Instrument {

    private String name;
    private int price;
    public static String color = "pink";

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void play() {
    }
}
