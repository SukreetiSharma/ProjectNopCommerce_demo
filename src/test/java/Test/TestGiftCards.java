package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestGiftCards extends BaseClass {

    @Test
    public void AbleToBuyGift(){
        pageFactory.getGiftCardProduct().AddGiftCard();
    }
}
