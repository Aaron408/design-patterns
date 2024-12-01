package State;

public class Game {

    //Estado actual del juego
    private State currentState;

    public Game() {
        this.currentState = new StoppedState();
    }

    public void setState(State newState) {
        this.currentState = newState;
    }

    public void pressPlay() {
        currentState.pressPlay();
    }

    public void pressPause() {
        currentState.pressPause();
    }

    public void pressStop() {
        currentState.pressStop();
    }
}
