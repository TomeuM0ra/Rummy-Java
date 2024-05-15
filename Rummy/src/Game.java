public class Game {
    private static Menu menu = new Menu();
    public static void jugar(){
        menu.elecio();
        boolean jocAcabat = false;

        while (!jocAcabat){
            switch (menu.modalidad()){
                case 1:

                case 2:
                    menu.elecioJugador();
            }
        }
    }
}
