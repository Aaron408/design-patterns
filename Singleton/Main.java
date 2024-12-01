package Singleton;

public class Main {

    public static void main(String[] args) {
        // Hacemos 2 constructures de nuestra instancia unica de userManager.
        UserManager userManager = UserManager.getInstance();
        UserManager userManager2 = UserManager.getInstance();

        // Agregamos usuarios con el primer constructor
        userManager.addUser("Aaron");
        userManager.addUser("Diego");

        // Mostramos los usuarios con el otro constructor, debe haber 2.
        userManager2.showConnectedUsers();

        // Desconectamos un usuario con un constructor
        userManager2.removeUser("Diego");

        // Mostramos los usuarios de nuevo con el otro constructor.
        userManager.showConnectedUsers();
    }
}
