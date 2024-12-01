package Adapter;

public class Main {

    public static void main(String[] args) {
        //Interfaz de la biblioteca existente.
        LibraryInterface libraryGraph = new LibraryInterface();

        //Adaptador para interactuar con la biblioteca.
        Chart adapter = new Adapter(libraryGraph);

        //Utilizamos la interfaz esperada.
        Client client = new Client(adapter);

        //Mostrar los datos en el grafico.
        //Le pasamos datos ya definidos para que tenga algo
        double[] data = {10.5, 20.3, 30.2, 40.1};
        client.showData("Datos", data);
    }
}
