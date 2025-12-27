package patterns.creational.abstractfactory;

public class WindowsScrollbar implements Scrollbar {
    @Override
    public void scroll() {
        System.out.println("Windows scrollbar scrolled");
    }
}
