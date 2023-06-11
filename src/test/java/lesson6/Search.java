package lesson6;

import lesson6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Search extends AbstractTest{

    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());
        homePage

                .clickOnElement(homePage.getSearchButton())
                .inputSearch("шампунь")
                .clickOnElement(homePage.getSearchGoodsButton());

                  Assertions.assertDoesNotThrow(homePage::getProfileHeader);
    }
}

