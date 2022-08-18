package cybertek.tests;

import cybertek.test_util.TestBase;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class P26_WebTables extends TestBase {


    @Test
    public void testWebTable(){
        driver.get("https://practice.cydeo.com/tables");
        String cell42Locator = "//table[@id='table1']/tbody/tr[4]/td[2]";

        WebElement cell42 = driver.findElement(By.xpath(cell42Locator));
        System.out.println("cell42 Text "+ cell42.getText());

        String cellTimLocator = "//table[@id='table1']//td[text()='Tim']";
        WebElement cellTim = driver.findElement(By.xpath(cellTimLocator));

        System.out.println("cellTim Text " + cellTim.getText());


        String row4CellLocator = "//table[@id='table1']/tbody/tr[4]/td";
        List<WebElement> allRow4Celss = driver.findElements(By.xpath(row4CellLocator));

        for (WebElement eachCell : allRow4Celss) {

            System.out.println("eachCell.getText() = " + eachCell.getText());

        }

    }
}
