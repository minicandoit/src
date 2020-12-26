package day44_Inheritance.WebdriverTask;

import java.rmi.Remote;

public class WebDriver {

    public String name,version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;

        //it is mandatory for subclass to set constructor
    }

    public void get(String URL){
        System.out.println("opening "+URL+"from the default Remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver");
    }

    public void maximize(){
        System.out.println("maximising the Remote driver");
    }


    @Override
    public String toString() {
        return "RemoteWebDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
/*
1. create a class called RemoveWebDriver
            name, version
            add a constructor to set the instances
            get(URL), maximize(),close()

 */

