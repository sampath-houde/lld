package patterns.creational.abstractfactory;

public class MacOsSrollbar implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Mac Os Scrollbar scrolled");
    }
}
