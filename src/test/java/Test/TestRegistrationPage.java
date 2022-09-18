package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestRegistrationPage extends BaseClass {

    @Test
    public void AbleToAddProduct() throws IOException {
        pageFactory.getRegistrationPage().ableToRegister();
    }
}
