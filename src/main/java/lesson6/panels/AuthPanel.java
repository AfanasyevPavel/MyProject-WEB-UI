package lesson6.panels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPanel {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button")
    private WebElement LKButton;
    @FindBy(xpath = "/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/ul/li[2]/a")
    private WebElement AuthButton;
    @FindBy(xpath = "//*[@id=\"login-email\"]")
    private WebElement inputLoginField;
    @FindBy(xpath = "//*[@id=\"login-password\"]")
    private WebElement inputPasswordField;
    @FindBy(xpath = "//*[@id=\"quick-login\"]/div[4]/button")
    private WebElement comeInButton;

    private String login = "afnpavl@gmail.com";
    private String password = "112233";


    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

    public AuthPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonWindow1() {
        return LKButton;
    }

    public WebElement getLoginButtonWindow2() {
        return AuthButton;
    }

    public WebElement getInputNameField() {
        return inputLoginField;
    }

    public WebElement getInputPasswordField() {
        return inputPasswordField;
    }

    public WebElement getComeInButton() {
        return comeInButton;
    }


    public AuthPanel clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public AuthPanel moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public AuthPanel inputLogin(String login) {
        inputLoginField.clear();
        inputLoginField.sendKeys(login);
        return this;
    }

    public AuthPanel inputPassword(String password) {
        inputPasswordField.clear();
        inputPasswordField.sendKeys(password);
        return this;
    }
    }