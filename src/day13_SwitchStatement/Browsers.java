package day13_SwitchStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";
        boolean valid = browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera" || browserName == "safari"
                || browserName == "edge" || browserName == "ie";
        String selectedBrowser = "";

        if (valid) {
            if (browserName == "chrome") {
                System.out.println("CHROME BROWSER IS SELECTED");
            } else if (browserName == "fire fox") {
                System.out.println("FIREFOX BROWSER IS SELECTED");
            } else if (browserName == "opera") {
                System.out.println("OPERA BROWSER IS SELECTED");
            } else if (browserName == "safari") {

                System.out.println("SAFARI BROWSER IS SELECTED");
            } else if (browserName == "edge") {
                selectedBrowser = "EDGE BROWSER IS SELECTED";
            } else {
                selectedBrowser = "IE BROWSER IS SELECTED";
            }

        } else {
            System.out.println("No such a browser");
        }
        System.out.println(selectedBrowser);


      /*
        String browserName="mini";
if(browserName=="Chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"){if(browserName=="Chrome"){
    browserName="Chrome Browser is selected";
}else if(browserName=="firefox"){
    browserName="firefox is selected";
}else if(browserName=="opera"){
    browserName="opera is selected";
}else{
    browserName="Safari is selected";
}

}else{browserName="Invalid browser name";}
        System.out.println(browserName);

     */
        /*
        4. write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name

         */
    }
}
