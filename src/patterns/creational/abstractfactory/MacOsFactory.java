package patterns.creational.abstractfactory;

public class MacOsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new MacOsSrollbar();
    }
}
