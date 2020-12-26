package day44_Inheritance.WebdriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver() {
        super("Chrome Browser", "V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+" from the chrome driver");
    }

    @Override
    public void close() {
        System.out.println("closing the chrome driver");
    }

    @Override//one method different function
    public void maximize() {
        System.out.println("maximising the chrome driver");
    }









}
