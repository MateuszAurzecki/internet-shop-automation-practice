package pl.b2bnetwork.page.checkoutPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public CheckoutObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = CheckoutData.PROCEED_TO_CHECKOUT_BUTTON)
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = CheckoutData.TERMS_AND_CONDITIONS_CHECKBOX)
    private WebElement conditionsCheckbox;

    @FindBy(xpath = CheckoutData.PROCEED_TO_CHECKOUT_BUTTON_AGAIN)
    private WebElement secondCheckoutButton;

    @FindBy(xpath = CheckoutData.BANK_WIRE_OPTION)
    private WebElement bankWireOption;

    @FindBy(xpath = CheckoutData.CONFIRM_ORDER_BUTTON)
    private WebElement confirmOrderButton;


    private void clickOnProceedToCheckoutButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
    }

    private void clickOnConditionCheckbox() {
        webDriverWait.until(ExpectedConditions.visibilityOf(conditionsCheckbox));
        conditionsCheckbox.click();
    }

    private void clickOnAnotherProceedToCheckoutButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(secondCheckoutButton));
        secondCheckoutButton.click();
    }

    private void clickOnBankWireOption() {
        webDriverWait.until(ExpectedConditions.visibilityOf(bankWireOption));
        bankWireOption.click();
    }

    private void clickOnConfirmOrder() {
        webDriverWait.until(ExpectedConditions.visibilityOf(confirmOrderButton));
        confirmOrderButton.click();
    }

    public void checkoutPages() {
        clickOnProceedToCheckoutButton();
        clickOnConditionCheckbox();
        clickOnAnotherProceedToCheckoutButton();
        clickOnBankWireOption();
        clickOnConfirmOrder();
    }


}
