package Observer;

import java.util.ArrayList;
import java.util.List;


//Esta clase gestiona a los observadores que tengamos
public interface Subject {

    void registerObserver(Observer observer);

    void notifyObservers();
}
