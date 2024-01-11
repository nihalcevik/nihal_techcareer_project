import org.openqa.selenium.By;
import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Login extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test(description = "Hatalı Kullanıcı Girişi")
    public void Test1() {
        loginPage.emailDoldur("dnm@gmail.com");
        loginPage.passwordDoldur("Abcdefg8");
        loginPage.girisYap();

        // Bekleme işlemi için WebDriverWait kullanımı
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"tooltip btn-danger\"]")));

        // Hata mesajını almak
        String errorMessage = errorMessageElement.getText();
        System.out.println("E-mail veya şifre bilgileriniz hatalı. " + errorMessage);

    }

    @Test
    public void Test2() throws InterruptedException {
        loginPage.emailDoldur("dnm@gmail.com");
        loginPage.passwordDoldur("Abcdefg8");
        loginPage.girisYap();
    }

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void Test3() throws InterruptedException {

       loginPage.setEmailInput("elfylmz123@gmail.com");
       loginPage.setPasswordInput("elfylmz123");
       loginPage.setLoginButton();

        Thread.sleep(3000);
        loginPage.successMessageController("MERHABA ELIF");
    }

}
