public class Fitxa {
    private String palo;
    private String valor;

    public Fitxa(String forma , String num){
        this.palo = forma;
        this.valor = num;
    }

    public String getPalo() {
        return palo;
    }


    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}

