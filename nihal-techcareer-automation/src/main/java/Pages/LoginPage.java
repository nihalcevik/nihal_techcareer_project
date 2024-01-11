package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.qameta.allure.Step;

public class LoginPage extends BaseTest{


    private By emailInput = By.cssSelector("[id=\"ug-email\"]");
    private By passwordInput = By.cssSelector("[id=\"ug-password\"]");
    private By loginButton = By.cssSelector("[class=\"btn col-12 btn-custom-pink text-upper text-center login\"]");


   @Step("Email alanına metin girişi sağlanır")
    public void emailDoldur(String text){
       driver.findElement(By.cssSelector("[id=\"ug-email\"]")).sendKeys(text);
  }

    @Step("Password alanına metin girişi sağlanır")
    public void passwordDoldur(String password) {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
      driver.findElement(passwordInput).sendKeys(password);

  }
    @Step("Giriş yap butonuna tıklanır")
    public void girisYap(){
    driver.findElement(By.cssSelector("[class=\"btn col-12 btn-custom-pink text-upper text-center login\"]")).click();
}
    @Step("Kayıt ol butonuna tıklanır")
    public void register(){
        driver.findElement(By.cssSelector("[class=\"btn col-12 btn-custom-gray text-upper text-center\"]")).click();
    }

    @Step("Email alanına metin girişi sağlanır")
public void setEmailInput(String text){
    driver.findElement(By.cssSelector("[id=\"ug-email\"]")).sendKeys(text);

}
    @Step("Password alanına metin girişi sağlanır")
public void setPasswordInput(String password){
    driver.findElement(By.cssSelector("[id=\"ug-password\"]")).sendKeys("elfylmz123");
}
    @Step("Login butonuna tıklanır")
public void setLoginButton(){
    driver.findElement(By.cssSelector("[class=\"btn col-12 btn-custom-pink text-upper text-center login\"]")).click();

}
    @Step("Success mesajı kontrol edilir")
public void successMessageController(String text){
    String value = driver.findElement(By.id("fullname")).getText();
    Assert.assertEquals(value, text);

}

}


