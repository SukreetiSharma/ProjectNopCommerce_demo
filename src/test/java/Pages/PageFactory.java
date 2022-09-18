package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    public RegistrationPage RegPage;

    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public RegistrationPage getRegistrationPage(){
        if(RegPage == null){
            RegPage = new RegistrationPage(driver);
        }
        return RegPage;
    }
}