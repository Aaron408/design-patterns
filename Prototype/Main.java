package Prototype;

public class Main {

    public static void main(String[] args) {
        //Creamos un coche e imprimimos sus detalles
        Car car1 = new Car("Toyota", "Corolla", 2020);
        car1.showDetails();

        //Clonamos el coche que acabamos de crear
        Car car2 = (Car) car1.clone();
        car2.showDetails();

        //Modificamos el modelo del coche clonado
        // Cambiar el modelo en el coche clonado
        car2.setModel("Camry");
        System.out.println("Después de cambiar el modelo del coche clonado:");
        car2.showDetails();

        //Creamos una moto
        Motorcycle moto1 = new Motorcycle("Yamaha", "Sport", 600);
        moto1.showDetails();

        //Clonamos la moto
        Motorcycle moto2 = (Motorcycle) moto1.clone();
        moto2.showDetails();

        //Modificamos el tipo de la moto clonada
        // Cambiar el tipo de moto en el objeto clonado
        moto2.setType("Cruiser");
        System.out.println("Después de cambiar el tipo de la moto clonada:");
        moto2.showDetails();
    }
}
