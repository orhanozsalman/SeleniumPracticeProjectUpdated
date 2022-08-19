package cybertek.tests;

import cybertek.test_util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class P31_WindowsHandle extends TestBase {

    @Test
    public void testWindows() throws InterruptedException {

        driver.get("https://practice.cydeo.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickHereElm = driver.findElement(By.linkText("Click Here"));
        clickHereElm.click();

        System.out.println("After Clicking driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("After Clicking driver.getWindowHandles() = " + driver.getWindowHandles());

        allHandles =driver.getWindowHandles();
        for (String eachHandle : allHandles) {

            System.out.println("eachHandle = " + eachHandle);
            Thread.sleep(2000);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

    }
}
