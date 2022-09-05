package cybertek.tests;

import cybertek.test_util.TestBase;
import cybertek.utilities.BrowserUtil;
import cybertek.utilities.WebOrderUtility;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import javax.sql.rowset.BaseRowSet;

public class P34_WebOrderTest extends TestBase {
    @Test
            public void testLogin(){

        WebOrderUtility.openWebOrderApp(driver);

        //driver.get("http://qa.transmuda.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager101");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();




    }

}
