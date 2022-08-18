package cybertek.tests;

import cybertek.test_util.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P28_FileUploadTest extends TestBase {



        @Test
        public void testFileUpload(){
        driver.get("https://practice.cydeo.com/upload");

        String filePath = "C:\\Users\\Zeyd Haris\\Desktop\\Screenshot 06-Aug-22 2_19_22 PM.png";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        System.out.println("END");

    }

}
