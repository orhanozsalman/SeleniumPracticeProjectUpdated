package cybertek.test_util;

import cybertek.utilities.WebDriverFactory2;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

    public WebDriver driver;

    @BeforeAll
    public static void initBrowserDriver() {
        System.out.println("@BeforeAll runs only once before all test");
    }

    @AfterAll
    public static void teardown(){
        System.out.println("@AfterAll runs only once after all test");
    }


    @BeforeEach
    public void setUpBrowser(){

        driver =  WebDriverFactory2.get("chrome");

    }

    @AfterEach
    public void ForgetPass() {
        driver.quit();

    }

}
