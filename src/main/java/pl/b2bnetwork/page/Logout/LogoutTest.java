package pl.b2bnetwork.page.Logout;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class LogoutTest {

    LogoutObject logoutObject;

    @BeforeClass
    private void setUp() {
        logoutObject = new LogoutObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(logoutObject);
    }

    @Test
    public void logoutTest(){
        logoutObject.logout();
    }
}
