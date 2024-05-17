import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Fitxa> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void colocarCarta(Fitxa carta){
        this.mano.add(carta);
    }

    public void descartarCarta(Fitxa carta) {
        this.mano.remove(carta);
    }

    public void mostrarMano() {
        System.out.println(nombre + " mano:");
        for (Fitxa carta : mano) {
            Missatge.soutFitxa(carta);
        }
    }

    public ArrayList<Fitxa> getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }
}
