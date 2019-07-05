package pl.b2bnetwork.report;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.b2bnetwork.cfg.SingletonWebDriver;

public class ReportTest {

    ReportObject reportObject;


    @BeforeClass
    private void setUp() {
        reportObject = new ReportObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(reportObject);
    }

    @Test
    public void reportTest(){

    }
}
