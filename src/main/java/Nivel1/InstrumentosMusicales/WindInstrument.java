package Nivel1.InstrumentosMusicales;

public class WindInstrument extends Instrument {


    public WindInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play (){
        System.out.println("A Wind Instrument is playing");
    }

}
