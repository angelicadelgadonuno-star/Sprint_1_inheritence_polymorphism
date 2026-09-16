package Nivel1.InstrumentosMusicales;

public class Main {
    static void main() {

        WindInstrument wind = new WindInstrument("wind", 1500);
        StringInstrument string = new StringInstrument("string", 1000);
        PercussionInstrument percussion = new PercussionInstrument("percussion", 850);


        wind.play();
        string.play();
        percussion.play();

        System.out.println("The color  of the Wind Instrument is " + wind.color);
        System.out.println("The color  of the String Instrument is " + string.color);
        System.out.println("The color  of the Percussion Instrument is " + percussion.color);

    }

}
