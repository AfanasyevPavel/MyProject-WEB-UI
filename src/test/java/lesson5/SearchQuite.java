package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchQuite extends AbstractTest{
    @Test
    void test() throws InterruptedException {
        getDriver().get("https://pastilafactory.ru");

        WebElement webElement1 = getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button"));
        webElement1.click();

        Thread.sleep(1000);

        WebElement webElement2 = getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/ul/li[2]/a"));
        webElement2.click();

        Thread.sleep(1000);

        WebElement webElement3 = getDriver().findElement(By.xpath("//*[@id=\"login-email\"]"));
        webElement3.sendKeys("afnpvl@gmail.com");

        Thread.sleep(1000);

        WebElement webElement4 = getDriver().findElement(By.xpath("//*[@id=\"login-password\"]"));
        webElement4.sendKeys("112233");

        Thread.sleep(1000);

        WebElement webElement5 = getDriver().findElement(By.xpath("//*[@id=\"quick-login\"]/div[4]/button"));
        webElement5.click();

        Thread.sleep(1000);

        WebElement webElement6 = getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[4]/button"));
        webElement6.click();

        Thread.sleep(1000);

        WebElement webElement7 = getDriver().findElement(By.xpath("//*[@id=\"search\"]/input"));
        webElement7.sendKeys("шампунь");

        Thread.sleep(1000);

        WebElement webElement8 = getDriver().findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        webElement8.click();

        Thread.sleep(1000);

        getDriver().navigate().refresh();
        Thread.sleep(1000);

        WebElement webElement9 = getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button"));
        webElement9.click();

        Thread.sleep(1000);

        WebElement webElement10 = getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/ul/li[6]/a"));
        webElement10.click();

        Thread.sleep(1000);

        WebElement webElement11 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/div/a"));
        webElement11.click();

        Thread.sleep(1000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button")));
    }
}
