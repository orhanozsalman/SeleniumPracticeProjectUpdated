package cybertek.tests;

import cybertek.test_util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P24_ForgetPassTest extends TestBase {


    @Test
    public void ForgetPassTest() {



        driver.get("https://practice.cydeo.com/forgot_password");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("a@mail.com" + Keys.ENTER);

        String currentURL = driver.getCurrentUrl();

        assertTrue(currentURL.endsWith("email_sent"));


    }

}


