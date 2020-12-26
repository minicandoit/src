package day44_Inheritance.WebdriverTask;

public class CybertekDriver extends WebDriver {

    public CybertekDriver() {
        super("CYbertekDriver", "V75.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+" from cybertek Driver");
    }

    @Override
    public void close() {
        System.out.println("closing the cybertek Driver");
    }

    @Override
    public void maximize() {
        System.out.println("maximize the cybertek Driver");
    }
}
