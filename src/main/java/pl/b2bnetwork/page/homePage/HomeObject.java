package pl.b2bnetwork.page.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeObject {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public HomeObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = HomeData.WOMEN_TAB)
    private WebElement womenTab;

    public void clickOnWomenTab() {
        webDriverWait.until(ExpectedConditions.visibilityOf(womenTab));
        womenTab.click();
    }
}
