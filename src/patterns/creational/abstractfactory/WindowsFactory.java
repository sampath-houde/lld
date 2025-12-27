package patterns.creational.abstractfactory;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new WindowsScrollbar();
    }
}
