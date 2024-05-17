public class Game {
    private static Menu menu = new Menu();

    public static int eleccio(){

        switch (menu.elecio()){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default :
                Missatge.soutText("Unexpected tocken");
                throw new IllegalStateException("Unexpected value: " + menu.elecio());

        }
    }
    public Game(int num){
            if (num == 1 || num == 2 || num == 3){
                Baraja cartes = new Baraja(1);

            } else {
                Baraja cartes = new Baraja(2);
            }
    }
}
