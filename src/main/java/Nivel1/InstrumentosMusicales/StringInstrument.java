package Nivel1.InstrumentosMusicales;

public  class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play (){
        System.out.println("A String Instrument is playing");
    }
}
