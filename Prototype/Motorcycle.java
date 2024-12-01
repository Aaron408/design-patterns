package Prototype;

public class Motorcycle implements Prototype {

    private String brand;
    private String type;
    private int engineCapacity;

    // Constructor para crear la moto
    public Motorcycle(String brand, String type, int engineCapacity) {
        this.brand = brand;
        this.type = type;
        this.engineCapacity = engineCapacity;
    }

    //Metodo para colnar
    @Override
    public Prototype clone() {
        return new Motorcycle(this.brand, this.type, this.engineCapacity);
    }

    //Metodo para modificar el tipo de moto después de clonar
    public void setType(String type) {
        this.type = type;
    }

    //Metodo para mostrar los detalles de la moto
    public void showDetails() {
        System.out.println("Moto [Marca: " + brand + ", Tipo: " + type + ", Capacidad: " + engineCapacity + "cc]");
    }
}
