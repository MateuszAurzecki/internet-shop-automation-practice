package pl.b2bnetwork.page.authorizationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationObject {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public AuthorizationObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = AuthorizationData.INPUT_EMAIL)
    private WebElement inputEmail;


    @FindBy(xpath = AuthorizationData.CREATE_ACCOUNT_BUTTON)
    private WebElement createAccountButton;


    private void inputEmailMethod(String email){
        webDriverWait.until(ExpectedConditions.visibilityOf(inputEmail));
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }


    private void clickInCreateAccount(){
        webDriverWait.until(ExpectedConditions.visibilityOf(createAccountButton));
        createAccountButton.click();
    }

    public void createAccount(String email){
        inputEmailMethod(email);
        clickInCreateAccount();
    }

}
