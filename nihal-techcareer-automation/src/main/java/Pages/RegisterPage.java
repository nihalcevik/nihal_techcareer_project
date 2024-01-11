package Pages;

import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.qameta.allure.Step;

public class RegisterPage extends BaseTest{
    @Step("Name Doldurulur")
    public void nameDoldur(String text){
      driver.findElement(By.cssSelector("[id=\"name\"]")).sendKeys(text);
  }
    @Step("Surname Doldurulur")
    public void surNameDoldur(String text){
        driver.findElement(By.cssSelector("[name=\"surname\"]")).sendKeys(text);
    }
    @Step("Day Alanına Tıklanır")
    public void dayDoldur(String dayValue) {
        // Gün dropdown'ını seçme
        driver.findElement(By.cssSelector("[id=\"day\"]")).click();
        // Bekleme süresi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Gün seçeneğini bekleyip seçme
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value=\"" + dayValue + "\"]"))).click();

}
    @Step("Month Alanına Tıklanır")
    public void monthDoldur(String monthValue) {
        // Ay dropdown'ını seçme
        driver.findElement(By.cssSelector("[id=\"month\"]")).click();
        // Bekleme süresi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Ay seçeneğini bekleyip seçme
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"month\"]/option[" + monthValue + "]"))).click();
    }
    @Step("Year Alanına Tıklanır")
    public void yearDoldur(String yearValue) {
        // Yıl dropdown'ını seçme
        driver.findElement(By.cssSelector("[id=\"year\"]")).click();
        // Bekleme süresi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Yıl seçeneğini bekleyip seçme
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value=\"" + yearValue + "\"]"))).click();
    }
    @Step("Gender Alanına Tıklanır")
    public void genderDoldur(String genderValue) {
        // Cinsiyet dropdown'ını seçme
        driver.findElement(By.cssSelector("[id=\"gender\"]")).click();
        // Bekleme süresi
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Cinsiyet seçeneğini bekleyip seçme
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gender\"]/option[" + genderValue + "]"))).click();
    }
    @Step("Email Alanı Doldurulur")
    public void emailDoldur(String email) {
        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys(email);
    }
    @Step("Password Alanı Doldurulur")
    public void passwordDoldur(String password) {
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);
    }
    @Step("Password Again Alanı Doldurulur")
    public void passwordAgainDoldur(String password) {
        driver.findElement(By.cssSelector("[name=\"password_again\"]")).sendKeys(password);
    }
    @Step("Register Butonuna Tıklanır")
    public void register() {
        // Kayıt butonuna tıklama
        driver.findElement(By.cssSelector("[id=\"uye-kayit-btn\"]")).click();
    }
    @Step("Repeated Password Kontrol Sağlanır")
    public void repeatedMessageControl(String text) {
      String value =  driver.findElement(By.cssSelector("[class=\"tooltip btn-danger\"]")).getText();
      Assert.assertEquals(value,text);

    }
}



