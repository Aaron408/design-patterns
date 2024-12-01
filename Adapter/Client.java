package Adapter;

public class Client {

    private Chart chart;

    public Client(Chart chart) {
        this.chart = chart;
    }

    public void showData(String title, double[] data) {
        chart.display(title, data);
    }
}

