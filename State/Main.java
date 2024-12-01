package State;

public class Main {

    public static void main(String[] args) {
        //Constructor de nuestro juego.
        Game game = new Game();

        //Iniciamos el juego
        game.pressPlay();

        // Cambiar el estado a jugando
        game.setState(new PlayingState());
        game.pressPause();

        //Detenemos el juego
        game.pressStop();

        //Reunudamos el juego pero en estado de pausa
        game.setState(new PausedState());
        game.pressPlay();  // Reanudar el juego
        game.pressStop();  // Detener el juego
    }
}
