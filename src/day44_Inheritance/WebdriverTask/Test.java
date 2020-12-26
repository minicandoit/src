package day44_Inheritance.WebdriverTask;

public class Test {
    public static void main(String[] args) {
       // ChromeDriver driver=new ChromeDriver();//open from the chrome
      //  fireFoxDriver driver=new fireFoxDriver();//open from firefox driver
       CybertekDriver driver=new CybertekDriver();//open from cybertek driver
        driver.get("Apple.com");

        driver.maximize();

        driver.close();



    }
}
