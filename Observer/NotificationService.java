package Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject {

    //Lista de usuarios a notificar
    private List<Observer> observers;

    private String notification;

    public NotificationService() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }

    // Método para actualizar el estado y notificar a los observadores
    public void publishNotification(String message) {
        this.notification = message;
        System.out.println("Publicando notificación: " + message);
        notifyObservers();
    }
}
