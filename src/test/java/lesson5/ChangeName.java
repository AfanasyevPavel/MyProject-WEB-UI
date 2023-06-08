package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ChangeName extends AbstractTest{

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
        webElement3. sendKeys("afnpvl@gmail.com");

        Thread.sleep(1000);

        WebElement webElement4 = getDriver().findElement(By.xpath("//*[@id=\"login-password\"]"));
        webElement4. sendKeys("112233");

        Thread.sleep(1000);

        WebElement webElement5 = getDriver().findElement(By.xpath("//*[@id=\"quick-login\"]/div[4]/button"));
        webElement5.click();

        Thread.sleep(1000);

        WebElement webElement6 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        webElement6.click();

        Thread.sleep(1000);

        WebElement webElement7 = getDriver().findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        webElement7. clear();
        webElement7. sendKeys("Сидоров");

        Thread.sleep(1000);

        WebElement webElement8 = getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/form/div/div[2]/input"));
        webElement8.click();

        Thread.sleep(1000);

        //   Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button")));
    }
}
