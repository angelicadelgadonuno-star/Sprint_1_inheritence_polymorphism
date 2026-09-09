package Nivel1.InstrumentosMusicales;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }
    @Override
    public void play (){
        System.out.println("A Percussion Instrument is playing");
    }
}
