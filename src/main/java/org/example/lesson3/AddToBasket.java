package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class AddToBasket {
    public static void addToBasket() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://pastilafactory.ru");

        WebElement webElement1 = webDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a"));
        webElement1.click();

        Thread.sleep(1000);

        WebElement webElement2 = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/ul/li[1]/a"));
        webElement2.click();

        Thread.sleep(1000);

        WebElement webElement3 = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div[2]/div/div[3]/div/div[2]/div[1]/h4/a"));
        webElement3.click();

        Thread.sleep(1000);

        WebElement webElement4 = webDriver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
        webElement4.click();

        Thread.sleep(1000);

        WebElement webElement5 = webDriver.findElement(By.xpath("//*[@id=\"cart\"]/div/div/i"));
        webElement5.click();

        Thread.sleep(1000);

        WebElement webElement6 = webDriver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[5]/button"));
        webElement6.click();

        Thread.sleep(1000);

        webDriver.quit();

    }
}