package lesson6;

import lesson6.pages.HomePage;
import lesson6.panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddToBasket extends AbstractTest {

    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel

                .clickOnElement(homePage.getLeanMarshmallowButton())
                .clickOnElement(homePage.getProteinFreeMarshmallowButton())
                .clickOnElement(homePage.getHoneyButton())
                .clickOnElement(homePage.getBuyButton())
                .clickOnElement(homePage.getBasketButton())
                .clickOnElement(homePage.getDeleteGoodsButton());

        Assertions.assertDoesNotThrow(homePage::getProfileHeader);

    }
}
