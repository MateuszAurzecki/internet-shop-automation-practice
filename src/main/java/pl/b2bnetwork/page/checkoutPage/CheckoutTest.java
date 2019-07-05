package pl.b2bnetwork.page.checkoutPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class CheckoutTest {

    private CheckoutObject checkoutObject;

    @BeforeClass
    private void setUp() {
        checkoutObject = new CheckoutObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(checkoutObject);
    }

    @Test
    public void checkoutPagesTest(){
        checkoutObject.checkoutPages();
    }

}
