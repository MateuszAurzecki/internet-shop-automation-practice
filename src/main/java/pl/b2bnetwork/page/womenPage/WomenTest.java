package pl.b2bnetwork.page.womenPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class WomenTest {

    WomenObject womenObject;

    @BeforeClass
    private void setUp() {
        womenObject = new WomenObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(womenObject);
    }

    @Test
    public void addingProductsToBasketTest() {
        womenObject.addingProductsToBasket();
        Assert.assertTrue(womenObject.isSummaryVisible());
    }

}
