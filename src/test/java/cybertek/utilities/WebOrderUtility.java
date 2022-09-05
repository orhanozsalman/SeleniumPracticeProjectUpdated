package cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class WebOrderUtility {

    public static void openWebOrderApp (WebDriver driverParam){

        driverParam.get("http://qa.transmuda.com/user/login");

    }
}
