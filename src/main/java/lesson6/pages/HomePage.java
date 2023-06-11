package lesson6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button")
    private WebElement loginButtonHeader;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
    private WebElement leanMarshmallowButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/a")
    private WebElement proteinFreeMarshmallowButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div/div[3]/div/div[2]/div[1]/h4/a")
    private WebElement honeyButton;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    private WebElement buyButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button")
    private WebElement BasketButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button")
    private WebElement DeleteGoodsButton;

    @FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[3]/a")
    private WebElement MarshmallSugarFreeButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/a")
    private WebElement MarshmallSugarFreeButton2;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div[2]/div/div[1]/div/div[2]/div[3]/button[3]")
    private WebElement AddBookmarksButton;

    @FindBy(xpath = "//*[@id=\"wishlist-total-count\"]/a")
    private WebElement MyBookmarksButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/table/tbody/tr/td[6]/a")
    private WebElement DeleteBookmarksButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/a[10]")
    private WebElement SubscriptionButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/form/fieldset/div/div/label[2]/input")
    private WebElement NoSubsButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/form/div/div[2]/input")
    private WebElement ContinueButton;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div[3]/div[2]/div[4]/button")
    private WebElement SearchButton;

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    private WebElement FieldSearch;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement SearchGoodsButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/a[1]")
    private WebElement ChangeInfoButton;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement SurnameField;


    @FindBy(xpath = "//*[@id=\"content\"]/div/form/div/div[2]/input")
    private WebElement Continue2Button;

    @FindBy(xpath = "//*[@id=\"logo\"]/a/img")
    private WebElement profileHeader;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonHeader() {
        return loginButtonHeader;
    }

    public WebElement getLeanMarshmallowButton() {
        return leanMarshmallowButton;
    }

    public WebElement getProteinFreeMarshmallowButton() { return proteinFreeMarshmallowButton;}

    public WebElement getHoneyButton() { return honeyButton;}

    public WebElement getBuyButton() { return buyButton;}

    public WebElement getBasketButton() { return BasketButton;}

    public WebElement getDeleteGoodsButton() { return DeleteGoodsButton;}

    public WebElement getMarshmallSugarFreeButton() { return MarshmallSugarFreeButton;}

    public WebElement getMarshmallSugarFreeButton2() { return MarshmallSugarFreeButton2;}

    public WebElement getAddBookmarksButton() { return AddBookmarksButton;}

    public WebElement getMyBookmarksButton() { return MyBookmarksButton;}

    public WebElement getDeleteBookmarksButton() { return DeleteBookmarksButton;}

    public WebElement getSubscriptionButton() { return SubscriptionButton;}

    public WebElement getNoSubsButton() { return NoSubsButton;}

    public WebElement getContinueButton() { return ContinueButton;}

    public WebElement getSearchButton() { return SearchButton;}

    public WebElement getSearchGoodsButton() { return SearchGoodsButton;}

    public WebElement getChangeInfoButton() { return ChangeInfoButton;}

    public WebElement getContinue2Button() { return Continue2Button;}

    public WebElement getProfileHeader() {
        return profileHeader;
    }

    public HomePage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public HomePage inputSearch(String text) {
        FieldSearch.clear();
        FieldSearch.sendKeys(text);
        return this;
    }

    public HomePage changeSurname(String text) {
        SurnameField.clear();
        SurnameField.sendKeys(text);
        return this;
    }
}