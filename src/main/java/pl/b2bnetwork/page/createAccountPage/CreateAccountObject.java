package pl.b2bnetwork.page.createAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public CreateAccountObject(WebDriver webDriver, WebDriverWait webDriverWait) {
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = CreateAccountData.GENDER_BUTTON)
    private WebElement genderButton;

    @FindBy(xpath = CreateAccountData.INPUT_FIRST_NAME)
    private WebElement inputFirstName;

    @FindBy(xpath = CreateAccountData.INPUT_LAST_NAME)
    private WebElement inputLastName;

    @FindBy(xpath = CreateAccountData.INPUT_PASSWORD)
    private WebElement inputPassword;

    @FindBy(xpath = CreateAccountData.DAY_OF_BIRTH)
    private WebElement dayOfBirth;

    @FindBy(xpath = CreateAccountData.MONTH_OF_BIRTH)
    private WebElement monthOfBirth;

    @FindBy(xpath = CreateAccountData.YEAR_OF_BIRTH)
    private WebElement yearOfBirth;

    @FindBy(xpath = CreateAccountData.ADDRESS_FIRST_NAME)
    private WebElement addressFirstName;

    @FindBy(xpath = CreateAccountData.ADDRESS_LAST_NAME)
    private WebElement addressLastName;

    @FindBy(xpath = CreateAccountData.ADDRESS_FIRST_LINE)
    private WebElement addressFirstLine;

    @FindBy(xpath = CreateAccountData.CITY)
    private WebElement city;

    @FindBy(xpath = CreateAccountData.STATE)
    private WebElement state;

    @FindBy(xpath = CreateAccountData.ZIP_CODE)
    private WebElement zipCode;

    @FindBy(xpath = CreateAccountData.COUNTRY)
    private WebElement country;

    @FindBy(xpath = CreateAccountData.MOBILE_PHONE)
    private WebElement mobilePhone;

    @FindBy(xpath = CreateAccountData.ALIAS_ADDRESS)
    private WebElement aliasAddress;

    @FindBy(xpath = CreateAccountData.SUBMIT_ACCOUNT_BUTTON)
    private WebElement submitAccountButton;


    private void clickOnGenderButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(genderButton));
        genderButton.click();

    }

    private void inputFirstName(String firstName) {
        webDriverWait.until(ExpectedConditions.visibilityOf(inputFirstName));
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
    }

    private void inputLastName(String LastName) {
        webDriverWait.until(ExpectedConditions.visibilityOf(inputLastName));
        inputLastName.clear();
        inputLastName.sendKeys(LastName);
    }

    private void inputPassword(String password) {
        webDriverWait.until(ExpectedConditions.visibilityOf(inputPassword));
        inputFirstName.clear();
        inputPassword.sendKeys(password);
    }

    private void selectDayOfBirth(String day) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("days")));
        Select select = new Select(dayOfBirth);
        select.selectByVisibleText(day);
    }

    private void selectMonthOfBirth(String month) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("months")));
        Select select = new Select(monthOfBirth);
        select.selectByVisibleText(month);
    }

    private void selectYearOfBirth(String year) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("years")));
        Select select = new Select(yearOfBirth);
        select.selectByVisibleText(year);
    }

    private void inputAddressFirstName(String addressName) {
        webDriverWait.until(ExpectedConditions.visibilityOf(addressFirstName));
        addressFirstName.clear();
        addressFirstName.sendKeys(addressName);
    }

    private void inputAddressSurname(String addressSurname) {
        webDriverWait.until(ExpectedConditions.visibilityOf(addressLastName));
        addressLastName.clear();
        addressLastName.sendKeys(addressSurname);
    }

    private void inputAddressFirstLine(String firstLine) {
        webDriverWait.until(ExpectedConditions.visibilityOf(addressFirstLine));
        addressFirstLine.clear();
        addressFirstLine.sendKeys(firstLine);
    }

    private void inputCity(String cityName) {
        webDriverWait.until(ExpectedConditions.visibilityOf(city));
        city.clear();
        city.sendKeys(cityName);
    }

    private void selectState(String stateName) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_state")));
        Select select = new Select(state);
        select.selectByVisibleText(stateName);
    }

    private void inputZipCode(String zipCodeChars) {
        webDriverWait.until(ExpectedConditions.visibilityOf(zipCode));
        zipCode.clear();
        zipCode.sendKeys(zipCodeChars);
    }

    private void selectCountry(String countryName) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_country")));
        Select select = new Select(country);
        select.selectByVisibleText(countryName);
    }

    private void inputMobilePhone(String mobilePhoneNumber) {
        webDriverWait.until(ExpectedConditions.visibilityOf(mobilePhone));
        mobilePhone.clear();
        mobilePhone.sendKeys(mobilePhoneNumber);
    }

    private void inputAlias(String alias) {
        webDriverWait.until(ExpectedConditions.visibilityOf(aliasAddress));
        aliasAddress.clear();
        aliasAddress.sendKeys(alias);
    }

    private void clickOnSubmitAccountButton() {
        webDriverWait.until(ExpectedConditions.visibilityOf(submitAccountButton));
        submitAccountButton.click();
    }

    public void registerAccount(String firstName, String lastName, String password, String day, String month, String year, String addressName, String addressSurname,
                                String addressFirstLine, String city, String state, String zip, String country, String mobilePhone, String alias) {

        clickOnGenderButton();
        inputFirstName(firstName);
        inputLastName(lastName);
        inputPassword(password);
        selectDayOfBirth(day);
        selectMonthOfBirth(month);
        selectYearOfBirth(year);
        inputAddressFirstName(addressName);
        inputAddressSurname(addressSurname);
        inputAddressFirstLine(addressFirstLine);
        inputCity(city);
        selectState(state);
        inputZipCode(zip);
        selectCountry(country);
        inputMobilePhone(mobilePhone);
        inputAlias(alias);
        clickOnSubmitAccountButton();
    }


}
