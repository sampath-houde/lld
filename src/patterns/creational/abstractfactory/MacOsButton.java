package patterns.creational.abstractfactory;

public class MacOsButton implements Button{
    @Override
    public void press() {
        System.out.println("Mac Os Button pressed");
    }
}
