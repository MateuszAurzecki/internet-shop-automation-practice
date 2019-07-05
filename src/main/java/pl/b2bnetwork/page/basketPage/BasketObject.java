package pl.b2bnetwork.page.basketPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketObject {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public BasketObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = BasketData.PROCEED_TO_CHECKOUT_BUTTON)
    private WebElement proceedToCheckoutButton;

    public void clickOnProceedToCheckoutButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
    }


}
