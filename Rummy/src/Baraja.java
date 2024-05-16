import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Fitxa> cartes;

    public Baraja(int num ) {
        cartes = new ArrayList<>();
        if (num == 1) {
            String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
            String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

            for (String palo : palos) {
                for (String valor : valores) {
                    cartes.add(new Fitxa(palo, valor));
                }
            }
        } else {
            String [] colors = {"negre","vermell","blau","groc"};
            String [] valors = {"1","2","3","4","5","6","7","8","9","10","11","12","13",};

            for (String color : colors){
                for(String valor : valors){
                    cartes.add(new Fitxa(color,valor));
                }
            }
        }

        
        Collections.shuffle(cartes);
    }

    public Fitxa repartirCarta() {
        if (!cartes.isEmpty()) {
            return cartes.remove(0);
        }
        return null;
    }

    public int getSize() {
        return cartes.size();
    }
}
