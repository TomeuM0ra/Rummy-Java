import java.util.Scanner;

public class Menu {
    public static Scanner escaner = new Scanner(System.in);

    public  int elecio() {
        int elecio;
        Missatge.soutText("Menu de Variacions ");
        Missatge.soutText("1. Rummy");
        Missatge.soutText("2. Rummikub");
        Missatge.soutText("3. Gin Rummy");
        Missatge.soutText("4. Rummy Argentino");
        elecio =escaner.nextInt();
        escaner.nextLine();
        return elecio;
    }
    public int modalidad(){
        int mode;
        Missatge.soutText("Selecioni la modalidad ");
        Missatge.soutText("Local");
        Missatge.soutText("Local Ranket");
        mode =escaner.nextInt();
        escaner.nextLine();
        return mode;
    }

    public int elecioJugador(){
        int jugadors;
        Missatge.soutText("Cuants de jugadors han de jugar ");
        jugadors =escaner.nextInt();
        escaner.nextLine();
        return jugadors;
    }
}
