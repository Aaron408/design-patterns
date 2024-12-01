package State;

public class StoppedState implements State {

    @Override
    public void pressPlay() {
        System.out.println("Iniciando un nuevo juego...");
    }

    @Override
    public void pressPause() {
        System.out.println("El juego está detenido, no se puede pausar.");
    }

    @Override
    public void pressStop() {
        System.out.println("El juego ya está detenido.");
    }
}
