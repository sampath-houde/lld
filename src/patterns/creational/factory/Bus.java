package patterns.creational.factory;

public class Bus implements Transport{
    @Override
    public void deliever() {
        System.out.println("Delivering Bus");
    }
}
