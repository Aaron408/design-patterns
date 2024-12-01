package Prototype;

public class Car implements Prototype {

    private String brand;
    private String model;
    private int year;

    //Constructor para crear el coche
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Metodo para clonar
    @Override
    public Prototype clone() {
        return new Car(this.brand, this.model, this.year);
    }

    //Metodo para modificar el modelo después de clonar
    public void setModel(String model) {
        this.model = model;
    }

    //Metodo para mostrar los detalles del coche
    public void showDetails() {
        System.out.println("Coche [Marca: " + brand + ", Modelo: " + model + ", Año: " + year + "]");
    }
}
