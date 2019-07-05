package pl.b2bnetwork.page.createAccountPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class CreateAccountTest {

    CreateAccountObject createAccountObject;

    @BeforeClass
    private void setUp() {
        createAccountObject = new CreateAccountObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(createAccountObject);
    }

    @Test
    @Parameters({"firstName", "lastName", "password", "day", "month", "year", "addressName", "addressSurname",
            "addressFirstLine", "city", "state", "zip", "country", "mobilePhone", "alias"})
    public void createAccountTest(String firstName, String lastName, String password, String day, String month, String year, String addressName, String addressSurname,
                                  String addressFirstLine, String city, String state, String zip, String country, String mobilePhone, String alias) {


        createAccountObject.registerAccount(firstName, lastName, password, day, month, year, addressName,
                addressSurname, addressFirstLine, city, state, zip, country, mobilePhone, alias);
    }
}
