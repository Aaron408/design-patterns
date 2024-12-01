package Adapter;

public class Adapter implements Chart {

    private LibraryInterface libraryInterface;

    // Instanciamos la interfaz de la biblioteca.
    public Adapter(LibraryInterface libraryInterface) {
        this.libraryInterface = libraryInterface;
    }

    @Override
    public void display(String title, double[] data) {
        libraryInterface.renderGraph(title, data);
    }
}
