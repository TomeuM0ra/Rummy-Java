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

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

