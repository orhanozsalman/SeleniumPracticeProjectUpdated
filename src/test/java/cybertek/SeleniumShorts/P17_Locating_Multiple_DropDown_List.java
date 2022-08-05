package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class P17_Locating_Multiple_DropDown_List {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dropdown");

        // identify the dropdown with multiple select options
        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));
        //wrap this element into select object
        Select multiItemSelect = new Select(multiItemDropdown);

        //check if this is a multi select option

        System.out.println("multiItemSelect.isMultiple() = "
                            + multiItemSelect.isMultiple());


        //check if this is a multi select list
        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("C#");
        multiItemSelect.selectByVisibleText("Java");

        //deselect items

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("C#");
        multiItemSelect.deselectByVisibleText("Java");

        multiItemSelect.deselectAll();


        driver.quit();



    }
}
