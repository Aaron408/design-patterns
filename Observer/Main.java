package Observer;

public class Main {

    public static void main(String[] args) {
        // Constructor de nuestro servicio de notificacioness
        NotificationService notificationService = new NotificationService();

        // Creamos nuestros usuarios a notificar
        User user1 = new User("Aaron");
        User user2 = new User("Diego");

        // Registramos los usuarios
        notificationService.registerObserver(user1);
        notificationService.registerObserver(user2);

        // Publicamos una notificación
        notificationService.publishNotification("Nuevo evento disponible.");

        // Publicar otra notificación
        notificationService.publishNotification("Actualización del sistema programada para mañana.");
    }
}
