package patterns.creational.factory;

public class Truck implements Transport {
    @Override
    public void deliever() {
        System.out.println("Delivering Truck");
    }
}
