package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Bookmarks extends AbstractTest {

    @Test
    void test() throws InterruptedException {
        getDriver().get("https://pastilafactory.ru");

        WebElement webElement1 = getDriver().findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
        webElement1.click();

        Thread.sleep(1000);

        WebElement webElement2 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/a"));
        webElement2.click();

        Thread.sleep(1000);

        WebElement webElement3 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div[1]/div/div[2]/div[3]/button[3]"));
        webElement3.click();

        Thread.sleep(1000);

        WebElement webElement4 = getDriver().findElement(By.xpath("//*[@id=\"wishlist-total-count\"]/a"));
        webElement4.click();

        Thread.sleep(1000);

        WebElement webElement5 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/table/tbody/tr/td[6]/a"));
        webElement5.click();

        Thread.sleep(1000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("//*[@id=\"wishlist-total-count\"]/a")));

    }
}
