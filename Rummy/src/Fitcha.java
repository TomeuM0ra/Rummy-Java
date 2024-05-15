import java.util.ArrayList;
public class Fitcha {
    private String tipo;
    private int color;


    private ArrayList creacioBaraja(int maxFitxa){
        ArrayList<String> baraja = new ArrayList<>();
        for (int i = 0; i <=  maxFitxa ; i++) {
            baraja.add("ID" + i);
        }
        return baraja;
    }

    private ArrayList manoPlayer(){
        ArrayList<String> mano = new ArrayList<>();
        for (int i = 0; i <= 14; i++) {
            mano.add()
        }

        return mano;
    }
}
