package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToBasket extends AbstractTest {

    @Test
    void test() throws InterruptedException {
        getDriver().get("https://pastilafactory.ru");

        WebElement webElement1 = getDriver().findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a"));
        webElement1.click();

        Thread.sleep(2000);

        WebElement webElement2 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/a"));
        webElement2.click();

        Thread.sleep(2000);

        WebElement webElement3 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div[3]/div/div[2]/div[1]/h4/a"));
        webElement3.click();

        Thread.sleep(2000);

        WebElement webElement4 = getDriver().findElement(By.xpath("//*[@id=\"button-cart\"]"));
        webElement4.click();

        Thread.sleep(2000);

        WebElement webElement5 = getDriver().findElement(By.xpath("//*[@id=\"cart\"]/div/div/i"));
        webElement5.click();

        Thread.sleep(2000);

        WebElement webElement6 = getDriver().findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button"));
        webElement6.click();

        Thread.sleep(2000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("//*[@id=\"cart\"]/div/div/i")));
    }
}