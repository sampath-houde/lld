package patterns.creational.abstractfactory;

public class Application {

    private Button button;
    private Scrollbar scrollbar;

    Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scrollbar = uiFactory.createScrollBar();
    }

    void renderUI() {
        button.press();
        scrollbar.scroll();
    }

    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        UIFactory macOSFactory = new MacOsFactory();

        Application windowsApp = new Application(windowsFactory);
        windowsApp.renderUI();

        Application macOsApp = new Application(macOSFactory);
        macOsApp.renderUI();

    }

}
