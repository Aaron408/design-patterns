package State;

public class PausedState implements State {

    @Override
    public void pressPlay() {
        System.out.println("Reanudando el juego...");
    }

    @Override
    public void pressPause() {
        System.out.println("El juego ya está en pausa.");
    }

    @Override
    public void pressStop() {
        System.out.println("Deteniendo el juego...");
    }
}
