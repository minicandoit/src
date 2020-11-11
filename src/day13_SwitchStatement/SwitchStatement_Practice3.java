package day13_SwitchStatement;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {

        String browser="ie";
        String selectedBrowser="";
        switch (browser){
            case "chrome":
                selectedBrowser="CHROME BROWSER";
            break;
            case "firefox" :
                selectedBrowser="FIREFOX BROWSER";
            break;
            case "opera":
                selectedBrowser="OPERA BROWSER";
            break;
            case "safari":
                selectedBrowser="SAFARI BROWSER";
            break;
            case "edge":
                selectedBrowser="EDGE BROWSER";
            break;
            case"ie":
                selectedBrowser="IE BROWSER";
           // case"cybrtek":
               // selectedBrowser="CYBERTEK BROWSER";//when you need add you can add more case
            default:
                selectedBrowser="INVALID BROWSER NAME";//no break statement needed
        }

        System.out.println(selectedBrowser);
    }
}
