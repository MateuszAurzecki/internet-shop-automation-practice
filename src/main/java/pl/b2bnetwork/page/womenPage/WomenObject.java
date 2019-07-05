package pl.b2bnetwork.page.womenPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WomenObject {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public WomenObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindAll(@FindBy(xpath = WomenData.PRODUCT_LIST))
    private List<WebElement> productList;

    @FindBy(xpath = WomenData.ADD_TO_CART)
    private WebElement addToCart;

    @FindBy(xpath = WomenData.CONTINUE_SHOPPING)
    private WebElement continueShopping;

    @FindBy(xpath = WomenData.WOMEN_TAB)
    private WebElement womenTab;

    @FindBy(xpath = WomenData.BASKET_BUTTTON)
    private WebElement basketButton;

    @FindBy(xpath = WomenData.CART_SUMMARY_HEADER)
    private WebElement cartSummaryHeader;


    private void addToCartButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(addToCart));
        addToCart.click();
    }

    private void continueShoppingButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(continueShopping));
        continueShopping.click();
    }

    private void clickOnWomenTab() {
        webDriverWait.until(ExpectedConditions.visibilityOf(womenTab));
        womenTab.click();
    }

    private void clickOnBasketButton() {
        basketButton.click();
    }


    public void addingProductsToBasket() {

        for(int i=0;i<productList.size();i++){
            List<WebElement> tmpList = webDriver.findElements(By.xpath(WomenData.PRODUCT_LIST));
            webDriverWait.until(ExpectedConditions.visibilityOf(tmpList.get(i)));
            tmpList.get(i).click();
            addToCartButton();
            continueShoppingButton();
            clickOnWomenTab();
        }
        clickOnBasketButton();
    }

    public boolean isSummaryVisible() {
        webDriverWait.until(ExpectedConditions.visibilityOf(cartSummaryHeader));
        return cartSummaryHeader.isDisplayed();
    }


}
