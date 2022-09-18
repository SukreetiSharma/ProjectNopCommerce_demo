package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;
    By Register = By.xpath("//a[contains(text(),'Register')]");
    By Gender = By.xpath("(//input[@name='Gender'])[1]");
    By FName = By.xpath("//input[@name='FirstName']");
    By LName = By.xpath("//input[@name='LastName']");
    By Emails = By.xpath("//input[@name='Email']");
    By Pass = By.xpath("//input[@name='Password']");
    By confirmPass = By.xpath("//input[@name='ConfirmPassword']");
    By Reg = By.xpath("//button[@name='register-button']");
    By Success = By.xpath("//div[contains(text(),'Your registration completed')]");
    By Continue = By.xpath("//a[contains(text(),'Continue')]");
    By LogOut = By.xpath("//a[contains(text(),'Log out')]");

    public RegistrationPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void ableToRegister(){
        driver.findElement(Register).click();
        driver.findElement(Gender).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FName));
        driver.findElement(FName).sendKeys("Adye");
        driver.findElement(LName).sendKeys("Sharma");
        driver.findElement(Emails).sendKeys("Adye@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Pass));
        driver.findElement(Pass).sendKeys("Adye@123");
        driver.findElement(confirmPass).sendKeys("Adye@123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Reg));
        driver.findElement(Reg).click();
        String actual = driver.findElement(Success).getText();
        Assert.isTrue(actual.equals("Your registration completed"),"Expected result does not match with actual result");
        driver.findElement(Continue).click();
        driver.findElement(LogOut).click();
    }
}
