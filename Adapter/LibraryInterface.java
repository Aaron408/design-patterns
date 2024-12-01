package Adapter;

public class LibraryInterface {
    public void renderGraph(String graphTitle, double[] graphData) {
        System.out.println("Renderizando gráfico: " + graphTitle);
        for (double value : graphData) {
            System.out.println("Dato: " + value);
        }
    }
}

