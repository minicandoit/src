package day44_Inheritance.WebdriverTask;

public class fireFoxDriver extends WebDriver{
    public fireFoxDriver() {
        super("fireFox Browser", "v83.0.0");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+"from firefox driver");
    }

    @Override
    public void close() {
        System.out.println("closing the fire Fox driver");
    }

    @Override
    public void maximize() {
        System.out.println("maximising the fire Fox driver");
    }
}
