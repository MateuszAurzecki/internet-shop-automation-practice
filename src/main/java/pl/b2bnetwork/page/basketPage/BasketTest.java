package pl.b2bnetwork.page.basketPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class BasketTest {

    BasketObject basketObject;

    @BeforeClass
    private void setUp() {
        basketObject = new BasketObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(basketObject);
    }


    @Test
    public void clickOnProceedToCheckoutButtonTest(){
        basketObject.clickOnProceedToCheckoutButton();
    }

}
