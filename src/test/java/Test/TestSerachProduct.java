package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class TestSerachProduct extends BaseClass {

    @Test
    public void AbleToAddProduct() throws IOException {
        pageFactory.getSearchProduct().AbleTosearch();
    }

}
