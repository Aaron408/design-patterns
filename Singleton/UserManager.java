package Singleton;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    //Definimos nuestra instancia unica para los usuarios.
    private static UserManager instance;
    // Lista de los ususarios conectados.
    private List<String> connectedUsers;

    private UserManager() {
        connectedUsers = new ArrayList<>();
    }

    // Método para obtener la instancia única.
    public static UserManager getInstance() {
        if (instance == null) {
            synchronized (UserManager.class) {
                if (instance == null) {
                    instance = new UserManager();
                }
            }
        }
        return instance;
    }

    // Metodo para conectar más usuarios
    public void addUser(String username) {
        connectedUsers.add(username);
        System.out.println(username + " se ha conectado.");
    }

    // Desconectar usuarios
    public void removeUser(String username) {
        connectedUsers.remove(username);
        System.out.println(username + " se ha desconectado.");
    }

    // Lista de ususarios.
    public void showConnectedUsers() {
        if (connectedUsers.isEmpty()) {
            System.out.println("No hay usuarios conectados.");
        } else {
            System.out.println("Usuarios conectados: " + connectedUsers);
        }
    }
}
