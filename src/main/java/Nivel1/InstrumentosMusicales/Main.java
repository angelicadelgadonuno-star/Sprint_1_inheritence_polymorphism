package Nivel1.InstrumentosMusicales;

public class Main {
    static void main() {

        WindInstrument wind = new WindInstrument("wind", 1500);
        StringInstrument string = new StringInstrument("string", 1000);
        PercussionInstrument percussion = new PercussionInstrument("percussion", 850);



        wind.play();
        string.play();
        percussion.play();


        System.out.println(Instrument.color);

    }

}
