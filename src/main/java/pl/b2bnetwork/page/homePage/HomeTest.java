package pl.b2bnetwork.page.homePage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class HomeTest {

    HomeObject homeObject;


    @BeforeClass
    public void setUp() {
        homeObject = new HomeObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(homeObject);
    }

    @Test
    @Parameters({"url"})
    public void clickOnWomenTabTest(String url) {
        homeObject.clickOnWomenTab();
        Assert.assertNotEquals(SingletonWebDriver.getWebDriver().getCurrentUrl(), url);
    }

}
