package cybertek.SeleniumLongVideos;

import cybertek.test_util.TestBase;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropdownPractices 
{

        
        
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropDown.selectByVisibleText("Illinois");

        stateDropDown.selectByValue("VA");




    }
}
