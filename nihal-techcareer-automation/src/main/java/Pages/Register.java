package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;
import Base.BaseTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Register extends BaseTest{
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    @Test(description = "Kullanıcı Olusturma")
    public void Test4() {
        loginPage.register();
        registerPage.nameDoldur("test");
        registerPage.surNameDoldur("QA");
        registerPage.dayDoldur("13");
        registerPage.monthDoldur("13");
        registerPage.yearDoldur("1996");
        registerPage.genderDoldur("3");
        registerPage.emailDoldur("test123@gmail.com");
        registerPage.passwordDoldur("test123");
        registerPage.passwordAgainDoldur("test123");
        List<WebElement> elements = driver.findElements(By.cssSelector("[class=\"fl icon-square-unchecked icon-small\"]"));
        for (WebElement element : elements) {
            element.click();
        }
        registerPage.register();
    }
    @Test(description = "Hatalı Sifre İle Kullanıcı Olusturma")
    public void Test5() {
        loginPage.register();
        registerPage.nameDoldur("test");
        registerPage.surNameDoldur("QA");
        registerPage.dayDoldur("13");
        registerPage.monthDoldur("13");
        registerPage.yearDoldur("1996");
        registerPage.genderDoldur("3");
        registerPage.emailDoldur("test123@gmail.com");
        registerPage.passwordDoldur("test123");
        registerPage.passwordAgainDoldur("test1234");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.cssSelector("[class=\"fl icon-square-unchecked icon-small\"]"));
        for (WebElement element : elements) {
            element.click();
        }
        registerPage.register();
        registerPage.repeatedMessageControl("Bu e-posta adresiyle kayıt yapılmıştır. Lütfen giriş yapınız.");
    }

}



