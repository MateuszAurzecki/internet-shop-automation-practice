package pl.b2bnetwork.page.authorizationPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class AuthorizationTest {

    AuthorizationObject authorizationObject;

    @BeforeClass
    private void setUp() {
        authorizationObject = new AuthorizationObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(authorizationObject);
    }

    @Test
    @Parameters({"email"})
    public void clickOnCreateAccountButtonTest(String email){
        authorizationObject.createAccount(email);

    }

}
