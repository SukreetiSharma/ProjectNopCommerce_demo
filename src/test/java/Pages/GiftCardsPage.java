package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GiftCardsPage {
    WebDriver driver;
    WebDriverWait wait;
    By GiftCard = By.xpath("(//a[contains(text(),'Gift Cards ')])[1]");
    By AddToCart = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    By RecipientName =  By.xpath("//input[@name='giftcard_43.RecipientName']");
    By RecipientEmail = By.xpath("//input[@name='giftcard_43.RecipientEmail']");
    By Name = By.xpath("//input[@name='giftcard_43.SenderName']");
    By Email = By.xpath("//input[@name='giftcard_43.SenderEmail']");
    By Message = By.xpath("//textarea[@name='giftcard_43.Message']");
    By Add = By.xpath("//button[contains(text(),'Add to cart')]");
    By ShoppingCart = By.xpath("//span[@class='cart-label']");
    By CheckBox = By.xpath("//input[@name='termsofservice']");
    By CheckOut = By.xpath("//button[@name='checkout']");
    By Reg = By.xpath("//button[contains(text(),'Register')]");
    String s = RandomStringUtils.randomAlphanumeric(8);
    By Gender = By.xpath("(//input[@name='Gender'])[1]");
    By FName = By.xpath("//input[@name='FirstName']");
    By LName = By.xpath("//input[@name='LastName']");
    By Emails = By.xpath("//input[@name='Email']");
    By Pass = By.xpath("//input[@name='Password']");
    By confirmPass = By.xpath("//input[@name='ConfirmPassword']");
    By Register = By.xpath("//button[@name='register-button']");
    By Continue = By.xpath("//a[contains(text(),'Continue')]");
    By Valid = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    By Country =By.xpath("//option[contains(text(),'United States')]");
    By State = By.xpath("//select[@name='BillingNewAddress.StateProvinceId']");
    By opt =By.xpath("//option[contains(text(),'Angola')]");
    By City = By.xpath("//input[@name='BillingNewAddress.City']");
    By Address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    By zip = By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    By number = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    By save = By.xpath("//button[@name='save']");
    By paySave = By.xpath("(//button[@name='save'])[2]");
    By Cont = By.xpath("(//button[contains(text(),'Continue')])[3]");
    By Confirm = By.xpath("//button[contains(text(),'Confirm')]");
    By SuccessMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continues = By.xpath("//button[contains(text(),'Continue')]");
    By Logout = By.xpath("//a[contains(text(),'Log out')]");

    public GiftCardsPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void AddGiftCard() {
        driver.findElement(GiftCard).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCart));
        driver.findElement(AddToCart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(RecipientName));
        driver.findElement(RecipientName).sendKeys("Sushma");
        driver.findElement(RecipientEmail).sendKeys("abc@gmail.com");
        driver.findElement(Name).sendKeys("Sukreeti");
        driver.findElement(Email).sendKeys("qwerty@gmail.com");
        driver.findElement(Message).sendKeys("A Special Gift for You!!");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Add));
        driver.findElement(Add).click();
        driver.findElement(ShoppingCart).click();
        driver.findElement(CheckBox).click();
        driver.findElement(CheckOut).click();
        driver.findElement(Reg).click();
        driver.findElement(Gender).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FName));
        driver.findElement(FName).sendKeys("Adye");
        driver.findElement(LName).sendKeys("Sharma");
        driver.findElement(Emails).sendKeys(s + "@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Pass));
        driver.findElement(Pass).sendKeys("Adye@123");
        driver.findElement(confirmPass).sendKeys("Adye@123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Register));
        driver.findElement(Register).click();
        driver.findElement(Continue).click();
        driver.findElement(CheckBox).click();
        driver.findElement(CheckOut).click();
        driver.findElement(Valid).click();
        driver.findElement(Country).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(State));
        driver.findElement(State).click();
        driver.findElement(opt).click();
        driver.findElement(City).sendKeys("qwerty");
        driver.findElement(Address).sendKeys("qwerty , usa");
        driver.findElement(zip).sendKeys("675438");
        driver.findElement(number).sendKeys("914532678");
        driver.findElement(save).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(paySave));
        driver.findElement(paySave).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Cont));
        driver.findElement(Cont).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Confirm));
        driver.findElement(Confirm).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage));
        String actual = driver.findElement(SuccessMessage).getText();
        Assert.isTrue(actual.equals("Your order has been successfully processed!"), "Expected result does not match with actual result");
        wait.until(ExpectedConditions.visibilityOfElementLocated(continues));
        driver.findElement(continues).click();
        driver.findElement(Logout).click();
    }
}
