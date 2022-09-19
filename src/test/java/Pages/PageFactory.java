package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    public RegistrationPage RegPage;
    public SearchProduct Search;
    public GiftCardsPage GiftCardPage;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public RegistrationPage getRegistrationPage(){
        if(RegPage == null){
            RegPage = new RegistrationPage(driver);
        }
        return RegPage;
    }

    public SearchProduct getSearchProduct(){
        if(Search == null){
            Search = new SearchProduct(driver);
        }
        return Search;
    }

    public GiftCardsPage getGiftCardProduct(){
        if(GiftCardPage == null){
            GiftCardPage = new GiftCardsPage(driver);
        }
        return GiftCardPage;
    }
}