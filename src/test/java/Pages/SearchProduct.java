package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchProduct {
    WebDriver driver;
    WebDriverWait wait;
    By SearchInput = By.xpath("//input[@name='q']");
    By search = By.xpath("//button[contains(text(),'Search')]");
    By AddTocart = By.xpath("//button[contains(text(),'Add to cart')]");
    By ShoppingCart = By.xpath("//span[@class='cart-label']");
    By Product = By.xpath("//th[@class='product']");

    public SearchProduct(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void AbleTosearch(){
        driver.findElement(SearchInput).sendKeys("Nokia");
        driver.findElement(search).click();
        driver.findElement(AddTocart).click();
        driver.findElement(ShoppingCart).click();
        String actual = driver.findElement(Product).getText();
        Assert.isTrue(actual.equals("Product(s)"), "Expected result does not match with actual result");
    }
}
