package lesson6;

import lesson6.pages.HomePage;
import lesson6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Login extends AbstractTest {

    @Test
    void test(){
        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .clickOnElement(authPanel.getLoginButtonWindow1())
                .clickOnElement(authPanel.getLoginButtonWindow2())
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())
                .clickOnElement(authPanel.getComeInButton());

        Assertions.assertDoesNotThrow(homePage::getProfileHeader);
    }
}
