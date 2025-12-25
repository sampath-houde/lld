package patterns.creational.factory;

public class Car implements Transport {
    @Override
    public void deliever() {
        System.out.println("Delivering car");
    }
}
