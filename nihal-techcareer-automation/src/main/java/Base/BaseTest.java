package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest extends Data {

    public static WebDriver driver;

   @BeforeClass
    public static void beforeTest(){
        if (browser.equals("Edge")) {
            driver = new EdgeDriver();

        }
        else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
        }
        driver.get("https://www.beblueshop.com/uye-girisi-sayfasi");
        driver.manage().window().maximize();

    }

  @AfterClass
    public static void afterTest() { driver.quit();

     }

}
