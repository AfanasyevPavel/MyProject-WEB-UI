package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Login {
    public static void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://pastilafactory.ru");

        WebElement webElement1 = webDriver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/button"));
        webElement1.click();

        Thread.sleep(1000);

        WebElement webElement2 = webDriver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[2]/div[3]/ul/li[2]/a"));
        webElement2.click();

        Thread.sleep(1000);

        WebElement webElement3 = webDriver.findElement(By.xpath("//*[@id=\"login-email\"]"));
        webElement3. sendKeys("afnpvl@gmail.com");

        Thread.sleep(1000);

        WebElement webElement4 = webDriver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        webElement4. sendKeys("112233");

        Thread.sleep(1000);

        WebElement webElement5 = webDriver.findElement(By.xpath("//*[@id=\"quick-login\"]/div[4]/button"));
        webElement5.click();

        Thread.sleep(1000);

        webDriver.quit();

    }

}
