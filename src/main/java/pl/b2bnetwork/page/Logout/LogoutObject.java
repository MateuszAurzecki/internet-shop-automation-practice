package pl.b2bnetwork.page.Logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutObject {
    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public LogoutObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = LogoutData.LOGOUT_BUTTON)
    private WebElement logoutButton;

    public void logout() {
        webDriverWait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }

}
