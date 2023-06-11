package lesson6;

import lesson6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Bookmarks extends AbstractTest {

    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());
        homePage

                .clickOnElement(homePage.getMarshmallSugarFreeButton())
                .clickOnElement(homePage.getMarshmallSugarFreeButton2())
                .clickOnElement(homePage.getAddBookmarksButton())
                .clickOnElement(homePage.getMyBookmarksButton())
                .clickOnElement(homePage.getDeleteBookmarksButton());

        Assertions.assertDoesNotThrow(homePage::getProfileHeader);
    }
}