package State;

public class PlayingState implements State {

    @Override
    public void pressPlay() {
        System.out.println("El juego ya está en curso.");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausando el juego...");
    }

    @Override
    public void pressStop() {
        System.out.println("Deteniendo el juego...");
    }
}
